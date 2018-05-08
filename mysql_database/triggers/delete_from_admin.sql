DROP TRIGGER IF EXISTS delete_admin;
DELIMITER //
CREATE TRIGGER `delete_"admin"` 
BEFORE DELETE ON `Admin` FOR EACH ROW 
BEGIN 
   DELETE FROM AdminShadow WHERE AdminShadow.admin_no = OLD.no; 
END
//
DELIMITER ;