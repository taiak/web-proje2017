DROP PROCEDURE IF EXISTS adminControl;

DELIMITER //

CREATE PROCEDURE adminControl(name VARCHAR(64), passwd VARCHAR(64))
BEGIN
  SET @return = FALSE;
  IF(EXISTS(SELECT name FROM  Admin WHERE  name = name AND password = passwd)) 
  THEN
    SET @return = TRUE;
  END IF;

  SELECT @return as 'sonuc';
END //

DELIMITER ;
