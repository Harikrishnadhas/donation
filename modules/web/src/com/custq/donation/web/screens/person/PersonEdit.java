package com.custq.donation.web.screens.person;

import com.custq.donation.entity.DonationCollection;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.custq.donation.entity.Person;
import org.apache.commons.math3.util.ArithmeticUtils;

import javax.inject.Inject;

@UiController("donation_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {
}