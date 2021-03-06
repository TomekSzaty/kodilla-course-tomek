CREATE TABLE STATS
(
    STAT_ID   INT(11) AUTO_INCREMENT PRIMARY KEY,
    STAT_DATE DATETIME    NOT NULL,
    STAT      VARCHAR(20) NOT NULL,
    VAlUE     INT(11)     NOT NULL
);

CREATE VIEW BESTSELLERS_COUNT AS
SELECT COUNT(BESTSELLER) AS COUNT
FROM books
WHERE BESTSELLER = 1;

SELECT *
FROM BESTSELLERS_COUNT;

SET @BESTSELLERSNUMBER = 0;

CREATE EVENT UPDATE_BESTSELLERS ON SCHEDULE EVERY 1 MINUTE DO
    BEGIN
        CALL UpdateBestsellers();
        SELECT * FROM BESTSELLERS_COUNT INTO @BESTSELLERSNUMBER;
        INSERT INTO STATS(STAT_DATE, STAT, VAlUE)
        VALUES (CURDATE(), 'BESTSELLERS', @BESTSELLERSNUMBER);
    END;

UPDATE books
SET BESTSELLER = FALSE;

