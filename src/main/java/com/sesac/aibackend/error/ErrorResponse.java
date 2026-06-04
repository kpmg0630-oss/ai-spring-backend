package com.sesac.aibackend.error;

import java.time.Instant;

public class ErrorResponse(String code, String message, Instant timestamp) {

    public static ErrorResponse of(String code, String message) {
        return new ErrorResponse(code, message, Instant.now());
}