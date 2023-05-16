package mach.domain;

import java.util.*;
import lombok.*;
import mach.domain.*;
import mach.infra.AbstractEvent;

@Data
@ToString
public class SpecAdded extends AbstractEvent {

    private Long id;
    private String specCd;
    private String specNm;

    public SpecAdded(Spec aggregate) {
        super(aggregate);
    }

    public SpecAdded() {
        super();
    }
}
