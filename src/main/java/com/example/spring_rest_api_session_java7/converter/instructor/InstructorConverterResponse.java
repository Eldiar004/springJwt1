package com.example.spring_rest_api_session_java7.converter.instructor;

import com.example.spring_rest_api_session_java7.dto.response.InstructorResponse;
import com.example.spring_rest_api_session_java7.entity.Instructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InstructorConverterResponse {

    public InstructorResponse create(Instructor instructor) {
        if (instructor == null) return null;
        InstructorResponse instructorResponse = new InstructorResponse();
        instructorResponse.setId(instructor.getId());
        instructorResponse.setLastName(instructor.getLastName());
        instructorResponse.setFirstName(instructor.getFirstName());
        instructorResponse.setEmail(instructor.getEmail());
        instructorResponse.setSpecialization(instructor.getSpecialization());
        instructorResponse.setPhoneNumber(instructor.getPhoneNumber());
        instructorResponse.setCount(instructor.getCount());

        return instructorResponse;
    }

    public List<InstructorResponse> getAll(List<Instructor> instructors) {
        List<InstructorResponse> instructorResponses = new ArrayList<>();
        for (Instructor instructor : instructors) {
            instructorResponses.add(create(instructor));
        }
        return instructorResponses;
    }
}
