use PROJE;
# musteri tablosuna ekleme ornegi

INSERT INTO Customer VALUES(0, 'Serhat Celil',   'İLERİ',  'serhatcelilileri@gmail.com');
INSERT INTO Customer VALUES(0, 'hidir2',  'surname_2',  'email_2');
INSERT INTO Customer VALUES(0, 'mehmet',  'surname_3',  'email_3');
INSERT INTO Customer VALUES(0, 'semra',  'surname_4',  'email_4');
INSERT INTO Customer VALUES(0, 'name_5',  'surname_5',  'email_5');
INSERT INTO Customer VALUES(0, 'name_6',  'surname_6',  'email_6');
INSERT INTO Customer VALUES(0, 'name_7',  'surname_7',  'email_7');
INSERT INTO Customer VALUES(0, 'name_8',  'surname_8',  'email_8');
INSERT INTO Customer VALUES(0, 'sci',     'surname_9',  'email_9');
INSERT INTO Customer VALUES(0, 'name_10', 'surname_10', 'email_10');
INSERT INTO Customer VALUES(0, 'name_11', 'surname_11', 'email_11');
INSERT INTO Customer VALUES(0, 'tayak',   'surname_12', 'email_12');
INSERT INTO Customer VALUES(0, 'name_13', 'surname_13', 'email_13');
INSERT INTO Customer VALUES(0, 'name_14', 'surname_14', 'email_14');
INSERT INTO Customer VALUES(0, 'name_15', 'surname_15', 'email_15');

# kullanici tablosuna ekleme ornegi
# require 'digest'
# def sha256(password)
#   Digest::SHA256.hexdigest(password)
# end
# # 'email_1' icin parola 'password_1'

INSERT INTO CustomerShadow VALUES(1, '38c5ae2bcd1f12aa269e45ae8c8762f030630a5137dd6d1c799c019626f33096' );
INSERT INTO CustomerShadow VALUES(2, 'ea76b1e251a0c876b3d96d2c81f12736df3bed36ecb293f79c493c089924cbdc' );
INSERT INTO CustomerShadow VALUES(3, '12313e7066d59b17cb8387c4d27ef847e39bc7b23ec48c9bbb6a08bac39252f3' );
INSERT INTO CustomerShadow VALUES(4, '334ddbbc1437d63a0bf14657fb9c584d6af8697701c726febb7d8a833d9bdf27' );
INSERT INTO CustomerShadow VALUES(5, '43eb28aba4577b8655cca86b084c8421660e50c40cdc1a3aad61dea941fdca05' );
INSERT INTO CustomerShadow VALUES(6, 'e3af2e502923051d802c608b7b7b31cbc978883f06cde3eb7bc0154e28a3e539' );
INSERT INTO CustomerShadow VALUES(7, 'ad395fe6c161f463caebc59851ce565ad032ff30e3c71cd04a5356ebe05a4eb5' );
INSERT INTO CustomerShadow VALUES(8, 'c62bb6b2345916b31d96d21b6d0a305936895bb8eef035cd15404cbd5fd4fb22' );
INSERT INTO CustomerShadow VALUES(9, '1a17e7d0d8c634f6812090d7dd1b5c7161e409c4ac5806c1197664345b8bc3e8' );
INSERT INTO CustomerShadow VALUES(10, '2811ee3c73ce17dfd398133f7207d4f8d7edbb97a54013880bf8fef8d930be2b' );
INSERT INTO CustomerShadow VALUES(11, '47bb0fb013b151d5210f7cdf0819157d5e3f0d73b4576f724fd4e16b3f34c5f4' );
INSERT INTO CustomerShadow VALUES(12, 'f3b85859a45a8578b31a8fbeac54195f3ad6339507fc5316f9c176fe16c0a58b' );
INSERT INTO CustomerShadow VALUES(13, '87de00b83184fe5513aa2ee4c73f2fcee13d6b23ecda3e1db98f312f2833b862' );
INSERT INTO CustomerShadow VALUES(14, 'e78b85ec36b1a26f0a08b2aa84814c1a23f2102ef4143713c090a3598b260306' );
INSERT INTO CustomerShadow VALUES(15, 'c9cd11537b30c2927618c2e6fdee76b907a033759a8907a40dc30e1f4b55c289' );

# product ekle
INSERT INTO Product VALUES(0, 'Apple Iphone 7 Plus',               10 , 3250, 'images/product/apple_iphone7.jpg' ,"" );
INSERT INTO Product VALUES(0, 'At Kafasi',                        100 ,   30, 'images/product/at_kafasi.jpg' ,"" );
INSERT INTO Product VALUES(0, 'Elektrikli Kure',                   20 ,   40, 'images/product/elektrikli_kure.jpg' ,"" );
INSERT INTO Product VALUES(0, 'Apple Iphone X',                   100 , 5200, 'images/product/iphonex.jpg' ,"" );
INSERT INTO Product VALUES(0, 'Kamera Kapatma Seysi',             850 ,    5, 'images/product/kamera_kapatma_seysi.jpg' ,"" );
INSERT INTO Product VALUES(0, 'MSI GE62 Gaming Laptop',            20 , 5300, 'images/product/msi_ge62.jpg' ,"" );
INSERT INTO Product VALUES(0, 'Philips Kulaklik',                 300 ,   75, 'images/product/philips_kulaklik.jpg' ,"" );
INSERT INTO Product VALUES(0, 'Sony Playstation 4',               200 ,  450, 'images/product/playstation.jpg' ,"" );
INSERT INTO Product VALUES(0, 'Samsung Galaxy Note 8',            204 , 3400, 'images/product/samsung_galaxy_note8.jpg' ,"" );
INSERT INTO Product VALUES(0, 'Samsung TV',                       359 , 3500, 'images/product/samsung_tv.jpg' ,"");
INSERT INTO Product VALUES(0, 'Spigen Arac Ici Telefon Tutacagi', 500 ,   59, 'images/product/spigen_arac_tutacagi.jpg' ,"");
INSERT INTO Product VALUES(0, 'Vestel TV',                         30 , 2500, 'images/product/vestel_tv.jpg' ,"");
INSERT INTO Product VALUES(0, 'Xiaomi Mi Band 2',                 263 ,   99, 'images/product/xiaomi_bileklik.jpg' ,"");
INSERT INTO Product VALUES(0, 'Xiaomi Mi 3',                      442 , 2100, 'images/product/xiaomi_mi3.jpg' ,"");
INSERT INTO Product VALUES(0, 'Xiaomi Mi 6',                      115 , 2250, 'images/product/xiaomi_mi6.jpg' ,"");
INSERT INTO Product VALUES(0, 'Xiaomi Mi Mix 2',                  254 , 2150, 'images/product/xiaomi_mi_mix.jpg' ,"");
INSERT INTO Product VALUES(0, 'Go Pro Hero 5',                     95 , 1500, 'images/product/gopro_hero5.jpg' ,"");
INSERT INTO Product VALUES(0, 'Kamp Sandalyesi',                  433 ,   80, 'images/product/kamp_sandalyesi.jpg' ,"");
INSERT INTO Product VALUES(0, 'GTA V - PS 4',                      23 ,   95, 'images/product/gta5.jpg' ,"");
INSERT INTO Product VALUES(0, 'FIFA 18 - PS 4',                   490 ,   75, 'images/product/fifa18.jpg' ,"");

# admin tablosuna ekleme ornegi
# require 'digest'
# def sha256(password)
#   Digest::SHA256.hexdigest(password)
# end
# 
# 'admin_1' kullanicisinin parolasi 'parola_1'
# puts "INSERT INTO Admin VALUES('#{sha256 'admin_1'}', '#{ sha256 'parola_1' }' );"
#

# yonetici ekleme
INSERT INTO Admin VALUES(0, 'admin_1');
INSERT INTO Admin VALUES(0, 'admin_2');
INSERT INTO Admin VALUES(0, 'admin_3');
INSERT INTO Admin VALUES(0, 'admin_4');
INSERT INTO Admin VALUES(0, 'admin_5');

# yonetici parolalari

# 1.upto(5) { |i | puts "INSERT INTO AdminShadow VALUES(#{i}, '#{sha256("parola_#{i}")}');"}
INSERT INTO AdminShadow VALUES(1, '3a37e4dec638e8d9114701cc6aafe19837b13455f075376e3a900904ed0a5e13');
INSERT INTO AdminShadow VALUES(2, '667393c0ee8f3857bc79efe8447d26d0cde594b158fdd4b7296abffdd7b9d062');
INSERT INTO AdminShadow VALUES(3, '4d3437de27a35a8d3137a7e301eb76aa7139d54eec9c62182791fbe471e99afa');
INSERT INTO AdminShadow VALUES(4, 'ec7039c2afc2c8e480c789a8dbde31834d567b5c7f721553af8d233dc628adc5');
INSERT INTO AdminShadow VALUES(5, 'e2d227b76949b9f9baf167d5a4b45a3319273de60691b408870a758842506876');

# odeme yontemleri
INSERT INTO Payment VALUES(0, 'kapida',       'Kapıda Ödeme - Nakit');
INSERT INTO Payment VALUES(0, 'banka',  'Banka Kartı ile 3D Ödeme');
INSERT INTO Payment VALUES(0, 'kredi', 'Kredi Kartı İle Ödeme');
INSERT INTO Payment VALUES(0, 'puan',      'Puanlar ile Ödeme');

# 20.times{ puts "INSERT INTO Order VALUES (0, #{rand(1..15)}, #{rand(1..15)}, '#{Time.now.strftime("%d-%m-%Y")}', #{rand(1..5)});" }
# siparis ekleme