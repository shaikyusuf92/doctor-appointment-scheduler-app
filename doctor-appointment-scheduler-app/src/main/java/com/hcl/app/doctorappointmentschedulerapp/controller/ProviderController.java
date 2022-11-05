package com.hcl.app.doctorappointmentschedulerapp.controller;

import com.hcl.app.doctorappointmentschedulerapp.entities.Provider;
import com.hcl.app.doctorappointmentschedulerapp.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//added cross-origin support to make http calls with angular ui
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ProviderController {


    @Autowired
    private ProviderRepository providerRepository;

    // get all providers based on the location
    @GetMapping("/providers")
    public List<Provider> getAllProvidersBasedOnLocation(@RequestParam String zipcode) {
        return providerRepository.findByZipCode(zipcode);
    }

    // create providers rest api
    @PostMapping("/providers")
    public Provider createProvider(@RequestBody Provider provider) {
        return providerRepository.save(provider);
    }

}