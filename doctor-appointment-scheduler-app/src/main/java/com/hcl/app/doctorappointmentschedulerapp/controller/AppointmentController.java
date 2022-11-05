package com.hcl.app.doctorappointmentschedulerapp.controller;

import com.hcl.app.doctorappointmentschedulerapp.entities.Appointment;
import com.hcl.app.doctorappointmentschedulerapp.exception.ResourceNotFoundException;
import com.hcl.app.doctorappointmentschedulerapp.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller class for Doctor Appointment Management
 */
@RestController
@RequestMapping("/api/v1/")
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // get api to retreive all Appointments
    @GetMapping("/appointment")
    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }

    // get api to retreive Appointment By Id
    @GetMapping("/appointment/{id}")
    public ResponseEntity<Appointment> getAppointmentById(@PathVariable Long id){
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment does not exist with id :" + id));
        return ResponseEntity.ok(appointment);
    }

    //update api to Update Appointment details
    @PutMapping("/appointment/{id}")
    public ResponseEntity<Appointment> updateAppointment(@PathVariable Long id, @RequestBody Appointment appointmentDetails){
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment not exist with id :" + id));

        appointment.setAppointmentTime(appointmentDetails.getAppointmentTime());
        appointment.setStarted(appointmentDetails.isStarted());
        appointment.setEnded(appointmentDetails.isEnded());
        appointment.setAppointmentTime(appointmentDetails.getAppointmentTime());
        appointment.setReasonForCancellation(appointmentDetails.getReasonForCancellation());

        Appointment updatedAppointment = appointmentRepository.save(appointment);
        return ResponseEntity.ok(updatedAppointment);
    }


    // delete api to cancel appointment
    @DeleteMapping("/appointment/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteAppointment(@PathVariable Long id){
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment not exist with id :" + id));

        appointmentRepository.delete(appointment);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }




}
