package com.mc.email.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID>{
    
}
