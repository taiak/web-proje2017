use PROJE;
# musteri tablosuna ekleme ornegi

INSERT INTO Customer VALUES(0, 'hidir',   'surname_1',  'email_1');
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
INSERT INTO Product VALUES(0, 'kulaklik', 18  , 12.5, '/yol/yol2' ,"kul hakki saklamaya yarayan aparat" );
INSERT INTO Product VALUES(0, 'at kafasi', 103 , 30.5, '/yol/yol2' ,"bu aciklama  product_2 icin" );
INSERT INTO Product VALUES(0, 'urun_3', 464 , 50.5, '/yol/yol2' ,"bu aciklama  urun_3 icin" );
INSERT INTO Product VALUES(0, 'urun_4', 413 , 85.5, '/yol/yol2' ,"bu aciklama  urun_4 icin" );
INSERT INTO Product VALUES(0, 'urun_5', 308 , 12.5, '/yol/yol2' ,"bu aciklama  urun_5 icin" );
INSERT INTO Product VALUES(0, 'urun_6', 329 , 12.5, '/yol/yol2' ,"bu aciklama  urun_6 icin" );
INSERT INTO Product VALUES(0, 'urun_7', 367 , 12.5, '/yol/yol2' ,"bu aciklama  urun_7 icin" );
INSERT INTO Product VALUES(0, 'urun_8', 283 , 12.5, '/yol/yol2' ,"bu aciklama  urun_8 icin" );
INSERT INTO Product VALUES(0, 'urun_9', 204 , 78.5, '/yol/yol2' ,"bu aciklama  urun_9 icin" );
INSERT INTO Product VALUES(0, 'urun_10', 359, 12.5, '/yol/yol2' ,"bu aciklama  urun_10 icin");
INSERT INTO Product VALUES(0, 'urun_11', 161, 12.5, '/yol/yol2' ,"bu aciklama  urun_11 icin");
INSERT INTO Product VALUES(0, 'urun_12', 6  , 12.5, '/yol/yol2' ,"bu aciklama  urun_12 icin");
INSERT INTO Product VALUES(0, 'urun_13', 263, 12.5, '/yol/yol2' ,"bu aciklama  urun_13 icin");
INSERT INTO Product VALUES(0, 'urun_14', 442, 12.5, '/yol/yol2' ,"bu aciklama  urun_14 icin");
INSERT INTO Product VALUES(0, 'urun_15', 115, 12.5, '/yol/yol2' ,"bu aciklama  urun_15 icin");
INSERT INTO Product VALUES(0, 'urun_16', 254, 12.5, '/yol/yol2' ,"bu aciklama  urun_16 icin");
INSERT INTO Product VALUES(0, 'urun_17', 95 , 12.5, '/yol/yol2' ,"bu aciklama  urun_17 icin");
INSERT INTO Product VALUES(0, 'urun_18', 433, 12.5, '/yol/yol2' ,"bu aciklama  urun_18 icin");
INSERT INTO Product VALUES(0, 'urun_19', 23 , 12.5, '/yol/yol2' ,"bu aciklama  urun_19 icin");
INSERT INTO Product VALUES(0, 'urun_20', 490, 12.5, '/yol/yol2' ,"bu aciklama  urun_20 icin");
INSERT INTO Product VALUES(0, 'urun_21', 205, 12.5, '/yol/yol2' ,"bu aciklama product_21 icin");

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
INSERT INTO Payment VALUES(0, 'nakit',       'comment_1');
INSERT INTO Payment VALUES(0, 'kredikarti',  'comment_2');
INSERT INTO Payment VALUES(0, 'banka karti', 'comment_3');
INSERT INTO Payment VALUES(0, 'bobrek',      'para yetmediyse demekki');
INSERT INTO Payment VALUES(0, 'das',         'lidyalilardan once yasayanlar icin');

# 20.times{ puts "INSERT INTO Order VALUES (0, #{rand(1..15)}, #{rand(1..15)}, '#{Time.now.strftime("%d-%m-%Y")}', #{rand(1..5)});" }
# siparis ekleme
INSERT INTO Orders VALUES (0, 13,  3, '08-05-2018', 1, TRUE);
INSERT INTO Orders VALUES (0,  7, 14, '08-05-2018', 2, TRUE);
INSERT INTO Orders VALUES (0, 10,  3, '08-05-2018', 1, TRUE);
INSERT INTO Orders VALUES (0,  6, 12, '08-05-2018', 4, TRUE);
INSERT INTO Orders VALUES (0, 14,  5, '08-05-2018', 1, TRUE);
INSERT INTO Orders VALUES (0, 15,  8, '08-05-2018', 2, TRUE);
INSERT INTO Orders VALUES (0, 11,  6, '08-05-2018', 4, TRUE);
INSERT INTO Orders VALUES (0, 10, 13, '08-05-2018', 4, TRUE);
INSERT INTO Orders VALUES (0, 10,  4, '08-05-2018', 1, TRUE);
INSERT INTO Orders VALUES (0,  4, 10, '08-05-2018', 5, TRUE);
INSERT INTO Orders VALUES (0, 13, 15, '08-05-2018', 1, FALSE);
INSERT INTO Orders VALUES (0,  9,  9, '08-05-2018', 4, FALSE);
INSERT INTO Orders VALUES (0, 11, 13, '08-05-2018', 3, FALSE);
INSERT INTO Orders VALUES (0, 14,  5, '08-05-2018', 3, FALSE);
INSERT INTO Orders VALUES (0, 15, 13, '08-05-2018', 1, FALSE);
INSERT INTO Orders VALUES (0,  8,  3, '08-05-2018', 4, FALSE);
INSERT INTO Orders VALUES (0, 15,  8, '08-05-2018', 3, FALSE);
INSERT INTO Orders VALUES (0, 11,  7, '08-05-2018', 1, FALSE);
INSERT INTO Orders VALUES (0,  1,  5, '08-05-2018', 4, FALSE);
INSERT INTO Orders VALUES (0, 14,  8, '08-05-2018', 1, FALSE);
