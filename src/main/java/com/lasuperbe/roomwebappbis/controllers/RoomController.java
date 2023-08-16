package com.lasuperbe.roomwebappbis.controllers;

import com.lasuperbe.roomwebappbis.models.Room;
import com.lasuperbe.roomwebappbis.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getRooms(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
