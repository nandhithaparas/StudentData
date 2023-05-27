package com.example.Students.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Students.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
