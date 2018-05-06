DROP PROCEDURE IF EXISTS userControl;

DELIMITER //

CREATE PROCEDURE userControl(email VARCHAR(50), password VARCHAR(64))
BEGIN
  SET @return = FALSE;
  IF(EXISTS(SELECT Musteri.email 
            FROM Kullanici INNER JOIN Musteri 
                           ON Kullanici.musteri_no = Musteri.no
            WHERE Kullanici.password = password AND Musteri.email = email)) 
  THEN
    SET @return = TRUE;
  END IF;

  SELECT @return as 'sonuc';
END //

DELIMITER ;
