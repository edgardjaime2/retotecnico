Insert into "MYUSER"."EVAL_TIP_GESTION"  (N_ID_TIPO_GESTION,C_DESCRIPCION,N_PESO,N_ESTADO,D_FEC_REGISTRO,C_USU_REGISTRO) values ('3','GESTION VISA','60','1',to_date('01/06/25','DD/MM/RR'),'GNOAIN');
Insert into "MYUSER"."EVAL_TIP_GESTION"  (N_ID_TIPO_GESTION,C_DESCRIPCION,N_PESO,N_ESTADO,D_FEC_REGISTRO,C_USU_REGISTRO) values ('4','GESTION MC','50','1',to_date('30/05/25','DD/MM/RR'),'GNOAIN');
Insert into "MYUSER"."EVAL_TIP_GESTION"  (N_ID_TIPO_GESTION,C_DESCRIPCION,N_PESO,N_ESTADO,D_FEC_REGISTRO,C_USU_REGISTRO) values ('5','CONTRACARGO VISA','0','1',to_date('30/05/25','DD/MM/RR'),'GNOAIN');
Insert into "MYUSER"."EVAL_TIP_GESTION"  (N_ID_TIPO_GESTION,C_DESCRIPCION,N_PESO,N_ESTADO,D_FEC_REGISTRO,C_USU_REGISTRO) values ('6','CONTRACARGO MC','0','1',to_date('30/05/25','DD/MM/RR'),'GNOAIN');



Insert into "MYUSER"."EVAL_REQ_DETALLE" (N_ID_RE_DETALLE,N_ID_REQ,C_COD_AUTORIZACION,D_FEC_TRX,N_MTO,C_USU_REGISTRO,D_FEC_REGISTRO,N_ID_TIPO_GESTION,D_FEC_GESTION)
 values ('1','2793862','080381',to_date('01/06/25','DD/MM/RR'),6.900,'SISTEMA',to_date('01/06/25','DD/MM/RR'),null,to_date('30/05/25','DD/MM/RR'));

Insert into "MYUSER"."EVAL_REQ_DETALLE" (N_ID_RE_DETALLE,N_ID_REQ,C_COD_AUTORIZACION,D_FEC_TRX,N_MTO,C_USU_REGISTRO,D_FEC_REGISTRO,N_ID_TIPO_GESTION,D_FEC_GESTION)
 values ('2','2793862','080381',to_date('01/06/25','DD/MM/RR'),14.900,'SISTEMA',to_date('01/06/25','DD/MM/RR'),null,to_date('30/05/25','DD/MM/RR'));


Insert into "MYUSER"."EVAL_REQ_DETALLE" (N_ID_RE_DETALLE,N_ID_REQ,C_COD_AUTORIZACION,D_FEC_TRX,N_MTO,C_USU_REGISTRO,D_FEC_REGISTRO,N_ID_TIPO_GESTION,D_FEC_GESTION)
 values ('3','2793862','080381',to_date('01/06/25','DD/MM/RR'),17.340,'SISTEMA',to_date('01/06/25','DD/MM/RR'),null,to_date('30/05/25','DD/MM/RR'));

Insert into "MYUSER"."EVAL_REQ_DETALLE" (N_ID_RE_DETALLE,N_ID_REQ,C_COD_AUTORIZACION,D_FEC_TRX,N_MTO,C_USU_REGISTRO,D_FEC_REGISTRO,N_ID_TIPO_GESTION,D_FEC_GESTION)
 values ('4','2793862','080381',to_date('01/06/25','DD/MM/RR'),50.600,'SISTEMA',to_date('01/06/25','DD/MM/RR'),null,to_date('30/05/25','DD/MM/RR'));

Insert into "MYUSER"."EVAL_REQ_DETALLE" (N_ID_RE_DETALLE,N_ID_REQ,C_COD_AUTORIZACION,D_FEC_TRX,N_MTO,C_USU_REGISTRO,D_FEC_REGISTRO,N_ID_TIPO_GESTION,D_FEC_GESTION)
 values ('5','2793862','080381',to_date('01/06/25','DD/MM/RR'),800.300,'SISTEMA',to_date('01/06/25','DD/MM/RR'),null,to_date('30/05/25','DD/MM/RR'));

 Insert into "MYUSER"."EVAL_REQ_DETALLE" (N_ID_RE_DETALLE,N_ID_REQ,C_COD_AUTORIZACION,D_FEC_TRX,N_MTO,C_USU_REGISTRO,D_FEC_REGISTRO,N_ID_TIPO_GESTION,D_FEC_GESTION)
 values ('6','2793862','080381',to_date('01/06/25','DD/MM/RR'),1856.960,'SISTEMA',to_date('01/06/25','DD/MM/RR'),null,to_date('30/05/25','DD/MM/RR'));
 commit;
