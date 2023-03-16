package com.ms.MIcroServiceEmail.repositories;

import com.ms.MIcroServiceEmail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel,Long> {
}
