package com.hcl.app.doctorappointmentschedulerapp.repository;

import com.hcl.app.doctorappointmentschedulerapp.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
