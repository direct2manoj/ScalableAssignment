package com.gfg.addressapp.controller;

import com.gfg.addressapp.response.AddressResponse;
import com.gfg.addressapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{studentId}")
    public ResponseEntity<AddressResponse> getAddressByStudentId(@PathVariable("studentId") int studentId) {
        AddressResponse addressResponse = addressService.findAddressByStudentId(studentId);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }

}
