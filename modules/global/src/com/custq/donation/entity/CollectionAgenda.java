package com.custq.donation.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "DONATION_COLLECTION_AGENDA")
@Entity(name = "donation_CollectionAgenda")
@NamePattern("%s|agenda")
public class CollectionAgenda extends StandardEntity {
    private static final long serialVersionUID = 7743410667759793578L;

    @NotNull
    @Column(name = "AGENDA", nullable = false)
    private String agenda;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "agenda")
    private List<DonationCollection> collections;

    public List<DonationCollection> getCollections() {
        return collections;
    }

    public void setCollections(List<DonationCollection> collections) {
        this.collections = collections;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }
}