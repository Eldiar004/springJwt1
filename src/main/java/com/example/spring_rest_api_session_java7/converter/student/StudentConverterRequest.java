package com.example.spring_rest_api_session_java7.converter.student;

import com.example.spring_rest_api_session_java7.dto.request.StudentRequest;
import com.example.spring_rest_api_session_java7.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentConverterRequest {

    public Student create(StudentRequest studentRequest) {
        if (studentRequest == null) return null;
        Student student = new Student();
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setEmail(studentRequest.getEmail());
        student.setPhoneNumber(studentRequest.getPhoneNumber());
        student.setStudyFormat(studentRequest.getStudyFormat());
        return student;
    }


    public void update(Student student, StudentRequest studentRequest) {
        if (studentRequest.getFirstName() != null) {
            student.setFirstName(studentRequest.getFirstName());
        }
       if (studentRequest.getLastName() != null) {
            student.setLastName(studentRequest.getLastName());
        }
       if (studentRequest.getEmail() != null) {
            student.setEmail(studentRequest.getEmail());
        }
       if (studentRequest.getPhoneNumber() != null) {
            student.setPhoneNumber(studentRequest.getPhoneNumber());
        }
       if (studentRequest.getStudyFormat() != null) {
            student.setStudyFormat(studentRequest.getStudyFormat());
        }

    }
}
