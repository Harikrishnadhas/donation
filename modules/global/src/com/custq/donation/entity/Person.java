package com.custq.donation.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "DONATION_PERSON")
@Entity(name = "donation_Person")
@NamePattern("%s|name")
public class Person extends StandardEntity {
    private static final long serialVersionUID = -3333199806461458783L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "FATHER_NAME")
    private String fatherName;

    @Column(name = "PLACE")
    private String place;

    @Column(name = "PHONE_NO", unique = true)
    private String phoneNo;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "person")
    private List<DonationCollection> donations;

    @Transient
    @MetaProperty(related = "donations")
    private Long amount;

    public Long getAmount() {
        return donations.stream().mapToLong(donationCollection -> donationCollection.getBook().getAmount().getId()).sum();
    }

    public List<DonationCollection> getDonations() {
        return donations;
    }

    public void setDonations(List<DonationCollection> donations) {
        this.donations = donations;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}