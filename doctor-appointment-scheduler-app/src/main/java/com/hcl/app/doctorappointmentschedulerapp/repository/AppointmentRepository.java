package com.hcl.app.doctorappointmentschedulerapp.repository;


import com.hcl.app.doctorappointmentschedulerapp.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
