package com.custq.donation.web.screens.collectionagenda;

import com.custq.donation.entity.DonationCollection;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.custq.donation.entity.CollectionAgenda;
import org.apache.commons.math3.util.ArithmeticUtils;

import javax.inject.Inject;

@UiController("donation_CollectionAgenda.edit")
@UiDescriptor("collection-agenda-edit.xml")
@EditedEntityContainer("collectionAgendaDc")
@LoadDataBeforeShow
public class CollectionAgendaEdit extends StandardEditor<CollectionAgenda> {
    @Inject
    private CollectionPropertyContainer<DonationCollection> collectionsDc;
    @Inject
    private TextField<Integer> collectionAmount;

    @Subscribe(id = "collectionsDc", target = Target.DATA_CONTAINER)
    public void onCollectionsDcCollectionChange(CollectionContainer.CollectionChangeEvent<DonationCollection> event) {
        int totalAmount = collectionsDc.getItems().stream().map(donationCollection -> donationCollection.getBook().getAmount().getId())
                .reduce(0, ArithmeticUtils::addAndCheck);

        collectionAmount.setValue(totalAmount);
    }
}