package example.service;

import example.exception.StudentNotFoundException;
import example.model.Error;
import example.model.Student;

import javax.inject.Singleton;

@Singleton
public class StudentService {
    public Student getStudentDetails(String name) {
        // Think of this as coming from the service
        if(name.equals("Pulkit")) {
            // Simulating a success service invocation
            return new Student("Pulkit",31);
        } else {
            // Consider this is a failed response
            Error error = new Error("Student not available", "NOT_FOUND");
            throw new StudentNotFoundException(error);
        }
    }
}

