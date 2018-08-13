package com.admin;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandlingController {

    @ExceptionHandler({ValidationException.class, ConstraintViolationException.class, MethodArgumentNotValidException.class})
    public ResponseEntity<List<Error>> validation(HttpServletRequest request, Exception ex) {
        List<Error> l = new ArrayList<>();

        if (ex instanceof ConstraintViolationException) {
            ConstraintViolationException e = (ConstraintViolationException) ex;
            System.out.println(e.getConstraintViolations().iterator().next().getMessage());
//        ConstraintViolation c = e.getConstraintViolations().iterator().next();
            for (ConstraintViolation c : e.getConstraintViolations()
                    ) {
                l.add(new Error(c.getPropertyPath().toString(), c.getMessage()));
            }
        }
        if (ex instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException e = (MethodArgumentNotValidException) ex;
//            System.out.println(e.getBindingResult().getAllErrors().next().getMessage());
//        ConstraintViolation c = e.getConstraintViolations().iterator().next();
            for (FieldError c : e.getBindingResult().getFieldErrors()
                    ) {
                l.add(new Error(c.getField(), c.getDefaultMessage()));
            }
        }
        return new ResponseEntity<>(l, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({Exception.class})
    public void teste(HttpServletRequest request, Exception e) {
        System.out.println(e);
    }
}

class Error {
    private String propriedade;
    private String erro;

    public Error(String propriedade, String erro) {
        this.propriedade = propriedade;
        this.erro = erro;
    }

    public String getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(String propriedade) {
        this.propriedade = propriedade;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}
