package com.custq.donation.web.screens.donationcollection;

import com.haulmont.cuba.gui.screen.*;
import com.custq.donation.entity.DonationCollection;

@UiController("donation_DonationCollection.browse")
@UiDescriptor("donation-collection-browse.xml")
@LookupComponent("donationCollectionsTable")
@LoadDataBeforeShow
public class DonationCollectionBrowse extends StandardLookup<DonationCollection> {
}