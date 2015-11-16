CREATE OR REPLACE FUNCTION garaazh.uuenda_kauba_staatus_aktiivseks(uuendatava_kauba_kood VARCHAR(20))
RETURNS VOID AS
$$
  UPDATE garaazh.kaup
  SET kauba_staatus = 1
  WHERE kauba_kood = uuendatava_kauba_kood AND kauba_staatus = 2;
$$ LANGUAGE SQL SECURITY DEFINER SET SEARCH_PATH = garaazh, pg_temp;

COMMENT ON FUNCTION garaazh.uuenda_kauba_staatus_aktiivseks (VARCHAR) IS '(OP3.1) Seab kauba aktiivseks';

DROP FUNCTION garaazh.uuenda_kauba_staatus_aktiivseks(uuendatava_kauba_kood VARCHAR(20));

CREATE OR REPLACE FUNCTION garaazh.uuenda_kauba_staatus_mitteaktiivseks(uuendatava_kauba_kood VARCHAR(20))
  RETURNS VOID AS
  $$
  UPDATE garaazh.kaup
  SET kauba_staatus = 2
  WHERE kauba_kood = uuendatava_kauba_kood AND kauba_staatus = 1;
  $$ LANGUAGE SQL SECURITY DEFINER SET SEARCH_PATH = garaazh, pg_temp;

COMMENT ON FUNCTION garaazh.uuenda_kauba_staatus_mitteaktiivseks (VARCHAR) IS '(OP4.1) Seab kauba mitteaktiivseks';

DROP FUNCTION garaazh.uuenda_kauba_staatus_mitteaktiivseks(uuendatava_kauba_kood VARCHAR(20));