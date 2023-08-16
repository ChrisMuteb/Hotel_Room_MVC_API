package com.lasuperbe.roomwebappbis.controllers;

import com.lasuperbe.roomwebappbis.models.Room;
import com.lasuperbe.roomwebappbis.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }
    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
}
