package com.supply_chain_base_operation.services;

import com.supply_chain_base_operation.model.Operation;
import com.supply_chain_base_operation.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationService {

    @Autowired
    private OperationRepository operationRepository;

    public List<Operation> fetchAllOpertaion(){
        return operationRepository.findAll();

    }
}
