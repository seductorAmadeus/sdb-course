package com.sbd.services;

import com.sbd.entities.RegisteredFailure;
import java.util.List;
import java.util.UUID;

public interface RegisteredFailureService {
    public RegisteredFailure getRegisteredFailure (UUID id);
    public void createRegisteredFailure (RegisteredFailure failure);
    public void updateRegisteredFailure (RegisteredFailure failure);
    public void deleteRegisteredFailure (UUID id);
    public List<RegisteredFailure> getAllRegisteredFailure ();
}
