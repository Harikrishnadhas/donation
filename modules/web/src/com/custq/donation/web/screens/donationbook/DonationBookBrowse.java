package com.custq.donation.web.screens.donationbook;

import com.haulmont.cuba.gui.screen.*;
import com.custq.donation.entity.DonationBook;

@UiController("donation_DonationBook.browse")
@UiDescriptor("donation-book-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class DonationBookBrowse extends MasterDetailScreen<DonationBook> {
}