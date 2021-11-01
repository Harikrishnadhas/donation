package com.custq.donation.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Amount implements EnumClass<Integer> {

    TWO_THOUSAND(2000),
    THOUSAND(1000),
    FIVE_HUNDRED(500),
    TWO_HUNDRED(200);

    private Integer id;

    Amount(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Amount fromId(Integer id) {
        for (Amount at : Amount.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}