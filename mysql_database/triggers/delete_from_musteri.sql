DROP TRIGGER IF EXISTS delete_musteri;
DELIMITER //
CREATE TRIGGER `delete_musteri` 
BEFORE DELETE ON `Musteri` FOR EACH ROW 
BEGIN 
   DELETE FROM Kullanici WHERE Kullanici.musteri_no = OLD.no; 
END
//
DELIMITER ;