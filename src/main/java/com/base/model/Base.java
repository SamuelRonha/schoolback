package com.base.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

/**
 * Created by Samuel on 17/06/2017.
 */
@MappedSuperclass
public class Base implements Model {
    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Integer version;

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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
