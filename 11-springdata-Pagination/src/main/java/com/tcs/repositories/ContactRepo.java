package com.tcs.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entities.Contact;

@Repository
public interface ContactRepo  extends JpaRepository<Contact, Serializable>{

}
