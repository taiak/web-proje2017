DROP DATABASE IF EXISTS PROJE;
source ./create_database/create_database.sql;
source ./create_database/add_example.sql;

USE PROJE;
source ./procedures/userControl.sql
source ./procedures/adminControl.sql
source ./procedures/adayMusteriOnayla.sql
source ./procedures/test.sql

USE PROJE;
source ./triggers/delete_from_musteri.sql


source ./make_user/make_user.sql
