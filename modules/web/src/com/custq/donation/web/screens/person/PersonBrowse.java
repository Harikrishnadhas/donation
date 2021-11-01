package com.custq.donation.web.screens.person;

import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.*;
import com.custq.donation.entity.Person;
import org.apache.commons.math3.util.ArithmeticUtils;

@UiController("donation_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<Person> {
}