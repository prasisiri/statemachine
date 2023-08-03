package com.postgres.statemachine;

import com.postgres.statemachine.model.Employee;
import com.postgres.statemachine.StateMachineEvents;

public interface StateMachineService {
    boolean executeTransition(Employee info, StateMachineEvents event);
}
