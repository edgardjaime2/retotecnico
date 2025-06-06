-- Crea un usuario y su esquema
CREATE USER myuser IDENTIFIED BY MyUser123;

-- Otorga privilegios al usuario

GRANT CONNECT,RESOURCE, CREATE SESSION, CREATE ANY TABLE,INSERT ANY TABLE,
UPDATE ANY TABLE, SELECT ANY TABLE, DROP ANY TABLE,
 CREATE ANY PROCEDURE,EXECUTE ANY PROCEDURE  TO myuser;
ALTER USER myuser DEFAULT TABLESPACE users QUOTA UNLIMITED ON users;

-- crea una tabla  EVAL_TIP_GESTION
CONNECT myuser/MyUser123;

 CREATE TABLE "MYUSER"."EVAL_TIP_GESTION"
     (	"N_ID_TIPO_GESTION" NUMBER GENERATED BY DEFAULT AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  NOT NULL ENABLE,
  	"C_DESCRIPCION" VARCHAR2(50 BYTE),
  	"N_PESO"  NUMBER (10),
  	"N_ESTADO" VARCHAR2(1 BYTE) NOT NULL ENABLE,
  	"D_FEC_REGISTRO" DATE,
  	"C_USU_REGISTRO" VARCHAR2(20 BYTE),
  	 CONSTRAINT "EVAL_TIP_GESTION2_PK" PRIMARY KEY ("N_ID_TIPO_GESTION")
    USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255
    STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
    PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
    BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
    TABLESPACE "USERS"  ENABLE
     ) SEGMENT CREATION IMMEDIATE
    PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255
   NOCOMPRESS LOGGING
    STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
    PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
    BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
    TABLESPACE "USERS" ;


  CREATE TABLE "MYUSER"."EVAL_REQ_DETALLE"
    (	"N_ID_RE_DETALLE" NUMBER GENERATED BY DEFAULT AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  NOT NULL ENABLE,
 	"N_ID_REQ" NUMBER,
 	"C_COD_AUTORIZACION" VARCHAR2(20 BYTE),
 	"D_FEC_TRX" DATE,
 	"N_MTO" NUMBER(10,3) ,
 	"C_USU_REGISTRO" VARCHAR2(20 BYTE),
 	"D_FEC_REGISTRO" DATE,
 	"N_ID_TIPO_GESTION" NUMBER DEFAULT NULL,
 	"D_FEC_GESTION" DATE,
 	 CONSTRAINT "EVAL_REQ_DETALLE_PK" PRIMARY KEY ("N_ID_RE_DETALLE")
   USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255
   STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
   PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
   BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   TABLESPACE "USERS"  ENABLE,
 	 CONSTRAINT "EVAL_REQ_DETALLE_EVAL_REQ_DETALLE_FK" FOREIGN KEY ("N_ID_TIPO_GESTION")
 	  REFERENCES "MYUSER"."EVAL_TIP_GESTION" ("N_ID_TIPO_GESTION") ENABLE
    ) SEGMENT CREATION IMMEDIATE
   PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255
  NOCOMPRESS LOGGING
   STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
   PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
   BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   TABLESPACE "USERS";
