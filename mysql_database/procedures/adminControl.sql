DROP PROCEDURE IF EXISTS adminControl;

DELIMITER //

CREATE PROCEDURE adminControl(name VARCHAR(64), passwd VARCHAR(64))
BEGIN
  SET @return = 'NaN';
  IF(EXISTS(SELECT name FROM  Admin INNER JOIN AdminShadow 
  	                                ON Admin.no = AdminShadow.admin_no
  			WHERE  Admin.name = name AND AdminShadow.password = passwd)) 
  THEN
    SET @return = name;
  END IF;

  SELECT @return as 'sonuc';
END //

DELIMITER ;
