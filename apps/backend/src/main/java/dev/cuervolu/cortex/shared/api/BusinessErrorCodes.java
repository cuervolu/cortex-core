package dev.cuervolu.cortex.shared.api;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

import org.springframework.http.HttpStatus;

public enum BusinessErrorCodes {

  EXPIRED_TOKEN(312, UNAUTHORIZED, "Token has expired");

  private final int code;
  private final String description;
  private final HttpStatus httpStatus;

  public int getCode() {
    return code;
  }
  public String getDescription() {
    return description;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  BusinessErrorCodes(int code, HttpStatus status, String description) {
    this.code = code;
    this.description = description;
    this.httpStatus = status;
  }
}
