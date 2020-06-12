package com.tcs.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entities.Insurance;
@Repository
public interface InsuranceRepo extends CrudRepository<Insurance, Serializable> {

}
