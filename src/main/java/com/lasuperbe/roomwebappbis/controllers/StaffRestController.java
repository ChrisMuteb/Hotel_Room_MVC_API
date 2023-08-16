package com.lasuperbe.roomwebappbis.controllers;

import com.lasuperbe.roomwebappbis.models.StaffMember;
import com.lasuperbe.roomwebappbis.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staffs")
public class StaffRestController {
    private StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }
    @GetMapping
    public List<StaffMember> getAllStaff(){
        return staffService.getAllStaff();
    }
}
