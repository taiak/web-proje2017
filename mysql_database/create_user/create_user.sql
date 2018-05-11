DROP USER IF EXISTS 'projeci'@'localhost';
CREATE USER 'projeci'@'localhost' IDENTIFIED BY 'nahsanabaklava.0';
GRANT ALL PRIVILEGES ON PROJE.* TO 'projeci'@'localhost';
FLUSH PRIVILEGES;
