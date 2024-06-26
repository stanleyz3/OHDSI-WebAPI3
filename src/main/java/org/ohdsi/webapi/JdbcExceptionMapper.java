package org.ohdsi.webapi;

import com.odysseusinc.logging.event.FailedDbConnectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class JdbcExceptionMapper implements ExceptionMapper<CannotGetJdbcConnectionException> {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

    @Override
    public Response toResponse(CannotGetJdbcConnectionException exception) {
        eventPublisher.publishEvent(new FailedDbConnectEvent(this, exception.getMessage()));
        return Response.ok().build();
    }
}