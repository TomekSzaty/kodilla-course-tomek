CREATE TABLE PHONES
(
    PHONE_ID  INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    PHONENUM  INT(9),
    FIRSTNAME VARCHAR(50),
    LASTNAME  VARCHAR(50)
);

DELIMITER $$

CREATE PROCEDURE FillTestData()
BEGIN
    DECLARE K INT DEFAULT 0;
    WHILE (K < 100000)
        DO
            INSERT INTO PHONES (PHONENUM,
                                FIRSTNAME,
                                LASTNAME)
            VALUES (ROUND(RAND() * 1000000000),
                    CONCAT('Firstname number ', K),
                    CONCAT('Lastname number ', K));
            IF (MOD(K, 5000) = 0) THEN
                COMMIT;
            END IF;
            SET K = K + 1;
        END WHILE;
    COMMIT;
END $$

DELIMITER ;

CREATE TABLE PHONESTATS
(
    ID         INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    RANGE_FROM INT(11),
    RANGE_TO   INT(11),
    QUANTITY   INT(11)
);

DELIMITER $$
CREATE PROCEDURE CalcPhoneStats()
BEGIN
    DECLARE K INT(11) DEFAULT 0;
    DECLARE QTY INT(11);
    DELETE FROM phonestats;
    COMMIT;
    WHILE (K < 100000000)
        DO
            SELECT COUNT(*)
            FROM phones
            WHERE PHONENUM BETWEEN K - 99999 AND K
            INTO QTY;
            INSERT INTO phonestats(RANGE_FROM, RANGE_TO, QUANTITY)
            VALUES (K - 99999, K, QTY);
            COMMIT;
            SET K = K + 100000;
        end while;
END $$
DELIMITER ;
CALL CalcPhoneStats();

EXPLAIN
SELECT COUNT(*)
FROM phones
WHERE PHONENUM BETWEEN 1 AND 100000;

CREATE INDEX PHONENO ON PHONES (PHONENUM);

call CalcPhoneStats();

EXPLAIN
SELECT COUNT(*)
FROM readers
WHERE FIRSTNAME = 'John';

CREATE INDEX FIRST_NAME ON READERS (FIRSTNAME, LASTNAME);

EXPLAIN
SELECT COUNT(*)
FROM books
WHERE TITLE = 'Old Book';

CREATE INDEX BOOK_TITLE ON BOOKS (TITLE);