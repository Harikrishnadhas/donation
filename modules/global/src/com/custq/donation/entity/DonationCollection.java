package com.custq.donation.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "DONATION_DONATION_COLLECTION")
@Entity(name = "donation_DonationCollection")
public class DonationCollection extends StandardEntity {
    private static final long serialVersionUID = -3890756166054288424L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AGENDA_ID")
    private CollectionAgenda agenda;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_", nullable = false)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_ID")
    private DonationBook book;

    @NotNull
    @Column(name = "BILL_NO", nullable = false)
    private Integer billNo;

    public CollectionAgenda getAgenda() {
        return agenda;
    }

    public void setAgenda(CollectionAgenda agenda) {
        this.agenda = agenda;
    }

    public Integer getBillNo() {
        return billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public DonationBook getBook() {
        return book;
    }

    public void setBook(DonationBook book) {
        this.book = book;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}