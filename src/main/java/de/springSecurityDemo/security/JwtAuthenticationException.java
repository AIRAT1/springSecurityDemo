package de.springSecurityDemo.security;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import javax.security.sasl.AuthenticationException;

@Getter
public class JwtAuthenticationException extends AuthenticationException {
    private HttpStatus httpStatus;

    public JwtAuthenticationException() {
        super();
    }

    public JwtAuthenticationException(String detail) {
        super(detail);
    }

    public JwtAuthenticationException(String detail, Throwable ex) {
        super(detail, ex);
    }

}
