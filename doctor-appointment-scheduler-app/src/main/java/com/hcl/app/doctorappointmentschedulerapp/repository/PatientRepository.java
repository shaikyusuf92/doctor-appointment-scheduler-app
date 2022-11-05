package com.hcl.app.doctorappointmentschedulerapp.repository;

import com.hcl.app.doctorappointmentschedulerapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
