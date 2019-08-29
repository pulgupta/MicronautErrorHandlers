package example.error.handler;

import example.exception.StudentNotFoundException;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;

import javax.inject.Singleton;

@Produces
@Singleton
@Requires(classes = {StudentNotFoundException.class, ExceptionHandler.class})
public class StudentNotFoundHandler implements ExceptionHandler<StudentNotFoundException, HttpResponse> {
    @Override
    public HttpResponse handle(HttpRequest request, StudentNotFoundException exception) {
        return HttpResponse.ok(exception.getError());
    }
}