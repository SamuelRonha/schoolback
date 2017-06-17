package com.locations.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class City extends Base {
    @ManyToOne(fetch = FetchType.LAZY)
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
