package com.lasuperbe.roomwebappbis.controllers;

import com.lasuperbe.roomwebappbis.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staffs")
public class StaffController {
    private StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }
    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("staff", staffService.getAllStaff());
        return "staffs";
    }
}
