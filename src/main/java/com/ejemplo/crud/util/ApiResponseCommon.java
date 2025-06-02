package com.ejemplo.crud.util;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ApiResponseCommon<T> {
    private static final Logger log = LoggerFactory.getLogger(ApiResponseCommon.class);

    @JsonProperty("data")
    private T data;

    @JsonProperty("code")
    private int code;

    @JsonProperty("messageType")
    private int messageType; // Enum para representar el tipo de mensaje

    @JsonProperty("message")
    private String message;

    @JsonProperty("description")
    private List<String> description;

    @JsonProperty("errors")
    private List<String> errors;

    @JsonProperty("totalElements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
	private Long totalElements;
	
	@JsonProperty("totalPages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer totalPages;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime timestamp;

    public ApiResponseCommon() {
        timestamp = LocalDateTime.now();
    }

    public ApiResponseCommon(T data, int code, int messageType, String message) {
        this.timestamp = LocalDateTime.now();
        this.data = data;
        this.messageType = messageType;
        this.message = message;
        this.code = code;
        this.description = Collections.emptyList();
        this.errors = description; // Aquí asignas la misma información a "errors"

    }

    public ApiResponseCommon(T data, int code, int messageType, String message, Object description) {
        this.timestamp = LocalDateTime.now();
        this.data = data;
        this.code = code;
        this.messageType = messageType;
        this.message = message;
        this.description = (description != null) ? extractDescription(description) : Collections.emptyList();
        this.errors = (description != null) ? extractDescription(description) : Collections.emptyList();

    }

    public ApiResponseCommon(T data, int code, int messageType, String message, Object description, Long totalElements, Integer totalPages) {
        this.timestamp = LocalDateTime.now();
        this.data = data;
        this.code = code;
        this.messageType = messageType;
        this.message = message;
        this.description = (description != null) ? extractDescription(description) : Collections.emptyList();
        this.errors = (description != null) ? extractDescription(description) : Collections.emptyList();
        this.totalElements = totalElements;
        this.totalPages = totalPages;
    }

    @SuppressWarnings("unchecked")
    private List<String> extractDescription(Object description) {
        return (description instanceof List) ? (List<String>) description
                : Collections.singletonList(description.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, code, messageType, message, description);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

}
