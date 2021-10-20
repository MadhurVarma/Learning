DROP TABLE IF EXISTS customer;

CREATE TABLE Course (
    COURSE_ID Bigserial PRIMARY KEY NOT NULL,
    COURSE_NAME varchar(100) NOT NULL,
    COURSE_DESC varchar(100) NOT NULL,
    SKILL_REQD varchar(100) NOT NULL,
    CREATED_ON timestamp;
    LAST_UPDATED_ON timestamp;
   );