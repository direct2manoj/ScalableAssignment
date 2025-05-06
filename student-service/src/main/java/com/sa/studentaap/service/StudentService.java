package com.sa.studentaap.service;

import com.sa.studentaap.entity.Student;
import com.sa.studentaap.repository.StudentRepo;
import com.sa.studentaap.response.StudentResponse;
import com.sa.studentaap.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;

// Importing required classes
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private ModelMapper mapper=  new ModelMapper();;

    @Autowired
    private StudentRepo studentRepo;

    private RestTemplate restTemplate = new RestTemplate();

    // Save operation
    public Student saveDepartment(Student student)
    {
        return studentRepo.save(student);
    }

    public StudentResponse getStudentById(int id) {
        Optional<Student> student = studentRepo.findById(id);
        StudentResponse studentResponse = mapper.map(student, StudentResponse.class);

        AddressResponse addressResponse = restTemplate.getForObject("http://localhost:8081/address-service/address/{id}", AddressResponse.class, id);
        studentResponse.setAddressResponse(addressResponse);

        return studentResponse;
    }

}
