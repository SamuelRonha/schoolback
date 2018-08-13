package com.base.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by Samuel on 17/06/2017.
 */
@MappedSuperclass
public class Base implements Model {
    @Id
    @GeneratedValue
    private Long id;

    @Column(updatable = false)
    @CreatedDate
    private Date created;

    @Column(insertable = false)
    @LastModifiedDate
    private Date modified;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

}
