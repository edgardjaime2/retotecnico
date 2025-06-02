package com.ejemplo.crud.util;


import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class ResponseGeneric {





    private String codigo;


    private String message;


    private Object data;





}
