package com.ski.ski.Repository;


import com.ski.ski.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository  extends JpaRepository<Registration,Long> {


}
