DROP PROCEDURE IF EXISTS userControl;

DELIMITER //

CREATE PROCEDURE userControl(email VARCHAR(50), password VARCHAR(64))
BEGIN
  SET @return = FALSE;
  IF(EXISTS(SELECT Customer.email 
            FROM CustomerShadow INNER JOIN Customer 
                           ON CustomerShadow.customer_no = Customer.no
            WHERE CustomerShadow.password = password AND Customer.email = email)) 
  THEN
    SET @return = TRUE;
  END IF;

  SELECT @return as 'value';
END //

DELIMITER ;
