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
);