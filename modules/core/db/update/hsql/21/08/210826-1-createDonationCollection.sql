create table DONATION_DONATION_COLLECTION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    AGENDA_ID varchar(36),
    DATE_ date not null,
    PERSON_ID varchar(36),
    BOOK_ID varchar(36),
    BILL_NO integer not null,
    --
    primary key (ID)
);