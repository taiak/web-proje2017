DROP PROCEDURE IF EXISTS deleteUser;

DELIMITER //

CREATE PROCEDURE deleteUser(no INT(64) UNSIGNED)
BEGIN
  SET @return = 'false';

  DELETE FROM Customer WHERE Customer.no = no;

  IF(NOT EXISTS(SELECT * FROM Customer WHERE Customer.no = no)) 
  THEN
    SET @return = name;
  END IF;

  SELECT @return as 'sonuc';
END //

DELIMITER ;
