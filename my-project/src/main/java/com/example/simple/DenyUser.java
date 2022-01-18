package com.example.simple;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class DenyUser implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        if ((Boolean) delegateExecution.getVariable("decision")) {
            System.out.println("Welcome");
        } else {
            System.out.println("We have been denied you, sorry");
        }
    }
}
