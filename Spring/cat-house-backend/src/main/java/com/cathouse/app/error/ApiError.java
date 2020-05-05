package com.cathouse.app.error;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.util.Date;

//Custom error class
public class ApiError {

    private HttpStatus httpStatus;
    private int HttpStatusValue;
    @JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    private Date dateTime;
    private String message;

    public ApiError(HttpStatus httpStatus, int httpStatusValue, Date dateTime, String message) {
        this.httpStatus = httpStatus;
        HttpStatusValue = httpStatusValue;
        this.dateTime = dateTime;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int getHttpStatusValue() {
        return HttpStatusValue;
    }

    public void setHttpStatusValue(int httpStatusValue) {
        HttpStatusValue = httpStatusValue;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
