package com.custq.donation.web.screens.donationcollection;

import com.haulmont.cuba.gui.screen.*;
import com.custq.donation.entity.DonationCollection;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

@UiController("donation_DonationCollection.edit")
@UiDescriptor("donation-collection-edit.xml")
@EditedEntityContainer("donationCollectionDc")
@LoadDataBeforeShow
public class DonationCollectionEdit extends StandardEditor<DonationCollection> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<DonationCollection> event) {
        event.getEntity().setDate(new Date());
    }
}