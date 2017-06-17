package com.locations;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class State extends Base {
    @ManyToOne
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
