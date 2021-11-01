package com.custq.donation.web.screens.collectionagenda;

import com.haulmont.cuba.gui.screen.*;
import com.custq.donation.entity.CollectionAgenda;

@UiController("donation_CollectionAgenda.browse")
@UiDescriptor("collection-agenda-browse.xml")
@LookupComponent("collectionAgendasTable")
@LoadDataBeforeShow
public class CollectionAgendaBrowse extends StandardLookup<CollectionAgenda> {
}