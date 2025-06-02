create or replace PROCEDURE  PKG_EVAL_ASIGNACION
 IS
 begin
  DECLARE  v_id    "MYUSER"."EVAL_REQ_DETALLE"."N_ID_RE_DETALLE"%TYPE;
 v_mto      "MYUSER"."EVAL_REQ_DETALLE"."N_MTO"%TYPE;
  CURSOR c_req_detalle IS    SELECT N_ID_RE_DETALLE, n_mto FROM "MYUSER"."EVAL_REQ_DETALLE";
  begin
  OPEN c_req_detalle;

  LOOP
    FETCH c_req_detalle INTO v_id, v_mto;
     EXIT WHEN c_req_detalle%NOTFOUND;
    IF v_mto IS NOT NULL AND v_mto <=10 THEN
      update "MYUSER"."EVAL_REQ_DETALLE"  set n_id_tipo_gestion=6, D_fEC_GESTION=CURRENT_DATE  where
       n_id_re_detalle=v_id;
      END IF;
    IF v_mto IS NOT NULL AND v_mto>10  and v_mto <=35  THEN
      update "MYUSER"."EVAL_REQ_DETALLE"  set n_id_tipo_gestion=5,D_fEC_GESTION=CURRENT_DATE  where
       n_id_re_detalle=v_id;
      END IF;

    IF v_mto IS NOT NULL AND v_mto>35  and v_mto <=100  THEN
      update "MYUSER"."EVAL_REQ_DETALLE"  set n_id_tipo_gestion=4,D_fEC_GESTION=CURRENT_DATE  where
       n_id_re_detalle=v_id;
      END IF;
       IF v_mto IS NOT NULL AND v_mto>100    THEN
      update "MYUSER"."EVAL_REQ_DETALLE"  set n_id_tipo_gestion=3,D_fEC_GESTION=CURRENT_DATE  where
       n_id_re_detalle=v_id;
      END IF;



    DBMS_OUTPUT.PUT_LINE('asigando tipo de gestion ' );
  END LOOP;

  CLOSE c_req_detalle;
  COMMIT;
END;
end;