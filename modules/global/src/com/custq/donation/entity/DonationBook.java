package com.custq.donation.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "DONATION_DONATION_BOOK")
@Entity(name = "donation_DonationBook")
@NamePattern("%s|bookNo")
public class DonationBook extends StandardEntity {
    private static final long serialVersionUID = 2007888840804357629L;

    @Column(name = "BOOK_NO", nullable = false, unique = true)
    @NotNull
    private String bookNo;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    private Integer amount;

    public Amount getAmount() {
        return amount == null ? null : Amount.fromId(amount);
    }

    public void setAmount(Amount amount) {
        this.amount = amount == null ? null : amount.getId();
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }
}