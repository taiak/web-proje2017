DROP DATABASE IF EXISTS PROJE;
CREATE DATABASE PROJE;

USE PROJE;

CREATE TABLE Musteri (
  no     INT(64) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  adi    VARCHAR(32) NOT NULL,
  soyadi VARCHAR(32) NOT NULL,
  email  VARCHAR(50) NOT NULL
);

CREATE TABLE Urun (
  no           INT(64) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  adi          VARCHAR(32) NOT NULL,
  stok_miktari INT(32) NOT NULL
);

CREATE TABLE Kullanici (
  musteri_no  INT(64) UNSIGNED PRIMARY KEY,
  password    VARCHAR(64) NOT NULL,
  FOREIGN KEY (musteri_no) REFERENCES Musteri (no)
);

CREATE TABLE Yonetici (
  user_name VARCHAR(64) NOT NULL PRIMARY KEY,
  password  VARCHAR(64) NOT NULL  
);

CREATE TABLE OdemeYontemleri (
  no       INT(5) UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
  adi      VARCHAR(15) NOT NULL,
  aciklama VARCHAR(150) NOT NULL
);

CREATE TABLE Siparis (
  no     INT(64) NOT NULL AUTO_INCREMENT,
  musteri_no     INT(64) UNSIGNED NOT NULL,
  urun_no        INT(64) UNSIGNED NOT NULL,
  siparis_tarihi VARCHAR(20) NOT NULL,
  odeme_yontemi_no  INT(5) UNSIGNED NOT NULL,
  FOREIGN KEY (odeme_yontemi_no) REFERENCES OdemeYontemleri(no),
  FOREIGN KEY (musteri_no) REFERENCES Musteri(no),
  FOREIGN KEY (urun_no)    REFERENCES Urun(no),
  PRIMARY KEY (no, musteri_no, urun_no, siparis_tarihi)
);

CREATE TABLE AdayMusteri (
  no     INT(64) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  adi    VARCHAR(32) NOT NULL,
  soyadi VARCHAR(32) NOT NULL,
  email  VARCHAR(50) NOT NULL
);
