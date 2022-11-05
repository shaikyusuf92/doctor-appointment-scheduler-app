package com.hcl.app.doctorappointmentschedulerapp.repository;

import com.hcl.app.doctorappointmentschedulerapp.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

    List<Provider> findByZipCode (String zipCode);

}
