-- begin DONATION_DONATION_BOOK
create table DONATION_DONATION_BOOK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BOOK_NO varchar(255) not null,
    AMOUNT integer not null,
    --
    primary key (ID)
)^
-- end DONATION_DONATION_BOOK
-- begin DONATION_PERSON
create table DONATION_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FATHER_NAME varchar(255),
    PLACE varchar(255),
    PHONE_NO varchar(255),
    --
    primary key (ID)
)^
-- end DONATION_PERSON
-- begin DONATION_DONATION_COLLECTION
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
)^
-- end DONATION_DONATION_COLLECTION
-- begin DONATION_COLLECTION_AGENDA
create table DONATION_COLLECTION_AGENDA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    AGENDA varchar(255) not null,
    --
    primary key (ID)
)^
-- end DONATION_COLLECTION_AGENDA
