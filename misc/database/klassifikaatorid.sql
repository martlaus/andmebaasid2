#Kauba kategooria

INSERT INTO garaazh.kauba_kategooria(kauba_kategooria_kood, ylem_kategooria, nimetus, kirjeldus) VALUES (1, NULL, 'Arvutikomponendid', 'Erinevad komponendid arvutitele.');

INSERT INTO garaazh.kauba_kategooria(kauba_kategooria_kood, ylem_kategooria, nimetus, kirjeldus) VALUES (2, 1, 'Kõvakettad', 'SSD ning HDD kõvakettad.');

INSERT INTO garaazh.kauba_kategooria(kauba_kategooria_kood, ylem_kategooria, nimetus, kirjeldus) VALUES (3, 1, 'Mälud', 'Operatiivmälud.');

INSERT INTO garaazh.kauba_kategooria(kauba_kategooria_kood, ylem_kategooria, nimetus, kirjeldus) VALUES (4, NULL, 'Telefonid', 'Erinevad nuti- ning mobiiltelefonid.');

INSERT INTO garaazh.kauba_kategooria(kauba_kategooria_kood, ylem_kategooria, nimetus, kirjeldus) VALUES (5, 4, 'Samsung Galaxy 6', 'Samsung Galaxy 6 nutitelefon.');

INSERT INTO garaazh.kauba_kategooria(kauba_kategooria_kood, ylem_kategooria, nimetus, kirjeldus) VALUES (6, 1, 'Emaplaadid', 'Valik erinevaid emaplaate.');

INSERT INTO garaazh.kauba_kategooria(kauba_kategooria_kood, ylem_kategooria, nimetus, kirjeldus) VALUES (7, NULL, 'Mängukonsoolid', 'Valik erinevaid mängukonsoole.');

INSERT INTO garaazh.kauba_kategooria(kauba_kategooria_kood, ylem_kategooria, nimetus, kirjeldus) VALUES (8, 7, 'Sony Playstation 4', 'Sony Playstation 4 mängukonsool.');


#Kauba staatus

INSERT INTO garaazh.kauba_staatus(kauba_staatuse_kood, nimetus, kirjeldus) VALUES (1, 'aktiivne', 'Lenovo IdeaPad sülearvuti Intel i3 protsessoriga.');

INSERT INTO garaazh.kauba_staatus(kauba_staatuse_kood, nimetus, kirjeldus) VALUES (2, 'mitteaktiivne', 'Playstation 3 mängukonsool.');


#Töötaja roll

INSERT INTO garaazh.tootaja_roll(tootaja_rolli_kood, nimetus, kirjeldus) VALUES (1, 'kaupade_haldaja', 'See annab õiguse teha mida iganes.');

#Töötaja staatus

INSERT INTO garaazh.tootaja_staatus(tootaja_staatuse_kood, nimetus, kirjeldus) VALUES (1, 'aktiivne', 'Töötaja on tegev.');

INSERT INTO garaazh.tootaja_staatus(tootaja_staatuse_kood, nimetus, kirjeldus) VALUES (2, 'mitteaktiivne', 'Töötaja ei ole tegev.');

#Riik

INSERT INTO garaazh.riik(riigi_kood, nimi) VALUES ('EE', 'Eesti');

INSERT INTO garaazh.riik(riigi_kood, nimi) VALUES ('RU', 'Venemaa');

INSERT INTO garaazh.riik(riigi_kood, nimi) VALUES ('LV', 'Läti');

INSERT INTO garaazh.riik(riigi_kood, nimi) VALUES ('LT', 'Leedu');

INSERT INTO garaazh.riik(riigi_kood, nimi) VALUES ('FI', 'Soome');
