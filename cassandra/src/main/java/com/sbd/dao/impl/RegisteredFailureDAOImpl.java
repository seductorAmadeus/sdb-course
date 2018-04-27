package com.sbd.dao.impl;

import com.sbd.dao.RegisteredFailureDAO;
import com.sbd.entities.RegisteredFailure;
import com.sbd.util.CassandraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class RegisteredFailureDAOImpl implements RegisteredFailureDAO {

    @Autowired
    private CassandraRepository repository;

    @Override
    public RegisteredFailure getRegisteredFailure(UUID id) {
        return repository.findById(id, RegisteredFailure.class);
    }

    @Override
    public void createRegisteredFailure(RegisteredFailure failure) {
        repository.create(failure);
    }

    @Override
    public void updateRegisteredFailure(RegisteredFailure failure) {
        repository.update(failure);
    }

    @Override
    public void deleteRegisteredFailure(UUID id) {
        repository.deleteById(id, RegisteredFailure.class);
    }

    @Override
    public List<RegisteredFailure> getAllRegisteredFailure() {
        return repository.findAll(RegisteredFailure.class, "registered_failures");
    }
}
