DROP PROCEDURE IF EXISTS UpdateBestsellers;
DELIMITER $$
CREATE PROCEDURE UpdateBestsellers()
BEGIN
    DECLARE BOOKSRENTNUMBER, BESTS_ID INT;
    DECLARE FINISHED INT DEFAULT 0;
    DECLARE ALL_BOOKS CURSOR FOR SELECT BOOK_ID FROM books;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
    OPEN ALL_BOOKS;
    WHILE (FINISHED = 0)
        DO
            FETCH ALL_BOOKS INTO BESTS_ID;
            IF (FINISHED = 0) THEN
                SELECT COUNT(*)
                FROM rents
                WHERE BOOK_ID = BESTS_ID
                INTO BOOKSRENTNUMBER;
                IF (BOOKSRENTNUMBER >= 2) THEN
                    UPDATE books
                    SET books.BESTSELLER = true
                    WHERE BOOK_ID = BESTS_ID;
                    COMMIT;
                END IF;
            END IF;
        END WHILE;
    CLOSE ALL_BOOKS;
END $$
DELIMITER ;
CALL UpdateBestsellers();

SELECT *
FROM books;