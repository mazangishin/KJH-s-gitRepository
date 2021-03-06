CREATE TABLE MEMBER(
    MEMBER_NUMBER   NUMBER          CONSTRAINT MEMBER_MEMBER_INDEX_PK PRIMARY KEY,
    ADMIN           NUMBER          NOT NULL,
    ID              VARCHAR2(20)    NOT NULL UNIQUE,
    EMAIL           VARCHAR2(30)    NOT NULL UNIQUE,
    PASSWORD        VARCHAR2(20)    NOT NULL,
    CREATE_DATE     DATE            NOT NULL,
    MODOFIED_DATE   DATE
);

CREATE TABLE BOARD(
    BOARD_NUMBER    NUMBER          CONSTRAINT BOARD_BOARD_INDEX_PK PRIMARY KEY,
    TITLE           VARCHAR2(50)    NOT NULL,
    MEMBER_NUMBER   NUMBER          CONSTRAINT BOARD_MEMBER_INDEX_FK REFERENCES MEMBER(MNO),
    CONTENT         VARCHAR2(500),
    CREATE_DATE     DATE            NOT NULL,
    MODIFIED_DATE   DATE
);

CREATE TABLE CHAMPION(
    CHAMPION_NUMBER NUMBER          CONSTRAINT CHAMP_CHMPION_INDEX_PK PRIMARY KEY,
    CHAMPION_NAME   VARCHAR2(20)    NOT NULL UNIQUE,
    CHAMPION_NICK   VARCHAR2(20)    NOT NULL UNIQUE,
    HP              NUMBER          NOT NULL,
    MP              NUMBER          NOT NULL,
    AD              NUMBER          NOT NULL,
    AP              NUMBER          NOT NULL
);

CREATE TABLE CHAMPION_PER_LEVEL(
    
);