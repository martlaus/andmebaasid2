DROP VIEW IF EXISTS garaazh.kauba_kuvatav_info;
CREATE VIEW garaazh.kauba_kuvatav_info WITH (security_barrier) AS
  SELECT
    kaup.nimetus                                                       AS kauba_nimi,
    kaup.hind,
    kaup.korgus,
    kaup.laius,
    kaup.pikkus,
    kategooria.nimetus                                                 AS kategooria_nimi,
    tootja.nimi || ', ' || tootja.registri_kood || ', ' || tootja.riik AS tootja,
    tootja.hinne                                                       AS tootja_reiting,
    tarnija.nimi                                                       AS tarnija,
    tarnija.tarneaeg                                                   AS tarnija_tarneaeg
  FROM garaazh.kaup AS kaup
    INNER JOIN garaazh.organisatsioon AS tootja ON kaup.tootja = tootja.organisatsiooni_kood
    INNER JOIN garaazh.kauba_kategooria AS kategooria ON kaup.kauba_kategooria = kategooria.kauba_kategooria_kood
    INNER JOIN garaazh.organisatsioon AS tarnija ON kaup.tarnija = tarnija.organisatsiooni_kood
  WHERE kaup.kauba_staatus = 1;

COMMENT ON VIEW garaazh.kauba_kuvatav_info IS 'Selles tabelis on kogu info, mida kasutaja peaks veebilehel nägema.';

DROP VIEW IF EXISTS garaazh.ylemkategooriad;
CREATE VIEW garaazh.ylemkategooriad WITH (security_barrier) AS
  SELECT
    kategooria.kauba_kategooria_kood AS kategooria_kood,
    kategooria.nimetus,
    kategooria.kirjeldus
  FROM garaazh.kauba_kategooria AS kategooria
  WHERE kategooria.ylem_kategooria IS NULL;

COMMENT ON VIEW garaazh.ylemkategooriad IS 'Selles tabelis on kõikide kaubaliikide ülemkategooriad';