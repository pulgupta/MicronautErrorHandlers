package example.controller;

import example.model.Student;
import example.service.StudentService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.inject.Inject;

@io.micronaut.http.annotation.Controller("/v1")
public class StudentController {

    @Inject
    StudentService service;

    @Get(value = "/student/{name}", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Student> getTasks(@PathVariable String name) {
        Student student = service.getStudentDetails(name);
        return HttpResponse.ok(student);
    }
}
