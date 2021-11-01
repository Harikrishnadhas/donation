alter table DONATION_DONATION_COLLECTION add constraint FK_DONATION_DONATION_COLLECTION_ON_AGENDA foreign key (AGENDA_ID) references DONATION_COLLECTION_AGENDA(ID);
alter table DONATION_DONATION_COLLECTION add constraint FK_DONATION_DONATION_COLLECTION_ON_PERSON foreign key (PERSON_ID) references DONATION_PERSON(ID);
alter table DONATION_DONATION_COLLECTION add constraint FK_DONATION_DONATION_COLLECTION_ON_BOOK foreign key (BOOK_ID) references DONATION_DONATION_BOOK(ID);
create index IDX_DONATION_DONATION_COLLECTION_ON_AGENDA on DONATION_DONATION_COLLECTION (AGENDA_ID);
create index IDX_DONATION_DONATION_COLLECTION_ON_PERSON on DONATION_DONATION_COLLECTION (PERSON_ID);
create index IDX_DONATION_DONATION_COLLECTION_ON_BOOK on DONATION_DONATION_COLLECTION (BOOK_ID);
