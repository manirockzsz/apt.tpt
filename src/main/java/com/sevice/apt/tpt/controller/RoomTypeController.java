package com.sevice.apt.tpt.controller;


import com.sevice.apt.tpt.entity.RoomType;
import com.sevice.apt.tpt.service.RoomTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class RoomTypeController {
    private RoomTypeService roomTypeService;
    @GetMapping("/roomTypes")
    @ResponseBody
    public List <RoomType> getRoomType(){

        return roomTypeService.getAllRoomTypes();
    }

    @GetMapping("/getRoomRent")
    @ResponseBody
    public int getRoomTypeRent(@RequestParam("roomTypeName") String roomTypeName){
    return roomTypeService.getRoomTypeRent(roomTypeName);
    }


    @GetMapping("/getTotalRoomRents")
    @ResponseBody
    public  int getRoomTypeFromLocation( @RequestParam ("roomTypeLocation1")String roomTypeLocation){
        return roomTypeService.getRoomTypeRentFromLocation(roomTypeLocation);

    }
}
