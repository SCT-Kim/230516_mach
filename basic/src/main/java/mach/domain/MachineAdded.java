package mach.domain;

import java.util.*;
import lombok.*;
import mach.domain.*;
import mach.infra.AbstractEvent;

@Data
@ToString
public class MachineAdded extends AbstractEvent {

    private Long id;
    private String code;
    private String name;
    private String model;
    private SpecId specId;

    public MachineAdded(Machine aggregate) {
        super(aggregate);
    }

    public MachineAdded() {
        super();
    }
}
