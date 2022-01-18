package com.example.simple;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CreateUser implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        CreateUser.class.getName();
        delegateExecution.getVariable("username");
    }
}
