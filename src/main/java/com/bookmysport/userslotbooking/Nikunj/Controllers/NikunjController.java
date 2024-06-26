package com.bookmysport.userslotbooking.Nikunj.Controllers;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.bookmysport.userslotbooking.Models.ResponseMessage;
import com.bookmysport.userslotbooking.Nikunj.Services.DeleteSlotService;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:5173")
public class NikunjController {

    @Autowired
    private DeleteSlotService deleteSlotService;

    @DeleteMapping("deleteslot")
    public ResponseEntity<ResponseMessage> deleteSlot(@RequestHeader UUID slotId, @RequestHeader String token,
            @RequestHeader String role) {
        return deleteSlotService.deleteSlotService(slotId, token, role);
    }

}
