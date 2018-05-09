DROP PROCEDURE IF EXISTS userControl;

DELIMITER //

CREATE PROCEDURE userControl(email VARCHAR(50), password VARCHAR(64))
BEGIN
    SET @nan = "NaN";

    IF(EXISTS(SELECT Customer.email FROM CustomerShadow INNER JOIN Customer 
                                ON CustomerShadow.customer_no = Customer.no
              WHERE CustomerShadow.password = password AND Customer.email = `email`))
    THEN
        SELECT Customer.no AS id, name, surname, email
        FROM CustomerShadow INNER JOIN Customer 
                                    ON CustomerShadow.customer_no = Customer.no
        WHERE CustomerShadow.password = password AND Customer.email = `email`;
    ELSE
        SELECT @nan as id, @nan as name, @nan as surname, @nan as email;
    END IF;
END //

DELIMITER ;
