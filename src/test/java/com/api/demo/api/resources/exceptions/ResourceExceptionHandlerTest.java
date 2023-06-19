package com.api.demo.api.resources.exceptions;

import org.hibernate.ObjectNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ResourceExceptionHandlerTest {

    public static final String OBJETO_NÃO_ENCONTRADO = "Objeto não encontrado";
    public static final String E_MAIL_JA_CADASTRADO = "E-mail já cadastrado";
    @InjectMocks
    private  ResourceExceptionHandler exceptionHandler;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

    }



    @Test
    void dataIntegrityViolationException() {
            ResponseEntity<StandardError> response = exceptionHandler
                    .dataIntegrityViolationException(
                            new DataIntegrityViolationException(E_MAIL_JA_CADASTRADO),
                            new MockHttpServletRequest());

            assertNotNull(response);
            assertNotNull(response.getBody());
            assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
            assertEquals(ResponseEntity.class, response.getClass());
            assertEquals(StandardError.class, response.getBody().getClass());
            assertEquals(E_MAIL_JA_CADASTRADO, response.getBody().getError());
            assertEquals(400, response.getBody().getStatus());



    }
}