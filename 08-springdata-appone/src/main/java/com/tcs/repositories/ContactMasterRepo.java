package com.tcs.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.tcs.entites.ContactMaster;

public interface ContactMasterRepo extends CrudRepository<ContactMaster,Serializable>{

}
