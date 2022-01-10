DROP TABLE IF EXISTS game CASCADE;
DROP SEQUENCE IF EXISTS global_sec;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE game (
    id              INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name            VARCHAR         NOT NULL,
    publisher       VARCHAR         NOT NULL,
    release         VARCHAR         NOT NULL,
    mode            VARCHAR         NOT NULL
);