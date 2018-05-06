DROP PROCEDURE IF EXISTS adayOnayi;

DELIMITER //
# 0 başarısız
# 1 başarılı
# 2 böyle bir aday yok

CREATE PROCEDURE adayOnayi(num int(64) unsigned)
BEGIN
	SET @return = 0;
	IF(EXISTS(SELECT * FROM AdayMusteri WHERE no = num))
	THEN
  	SELECT adi, soyadi, email INTO @ad, @soyad, @email FROM AdayMusteri WHERE no = num LIMIT 1;
		INSERT INTO Musteri (no, adi, soyadi, email) VALUES(0, @ad, @soyad, @email);
  	DELETE FROM AdayMusteri WHERE no = num;
  	SET @return = 1;
  ELSE
    SET @return = 2;
  END IF;

  SELECT @return as 'sonuc';
END //

DELIMITER ;
