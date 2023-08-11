package com.example.demo.controller;

import com.example.demo.model.Event;
import com.example.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;
    @PostMapping("/add")
    public Event addevent(@RequestBody Event event){
        return this.eventService.addEvent(event);
    }
    @GetMapping("/all")
    public List <Event> getallevents(){
        return this.eventService.getAllEvents();
    }
}
