package com.lasuperbe.roomwebappbis.service;

import com.lasuperbe.roomwebappbis.models.Position;
import com.lasuperbe.roomwebappbis.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static final List<StaffMember> staff = new ArrayList<>();
    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Jane", "Doe", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Oliver", "Handle", Position.SECURITY));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Sonny", "Smith", Position.HOUSEKEEPING));
    }

    public List<StaffMember> getAllStaff(){
        return staff;
    }
}
