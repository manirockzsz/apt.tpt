package com.sevice.apt.tpt.service;

import com.sevice.apt.tpt.entity.RoomType;
import com.sevice.apt.tpt.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomTypeService {
    @Autowired
    private RoomTypeRepository roomTypeRepository;
    public List<RoomType> getAllRoomTypes() {
        List<RoomType> roomTypes = roomTypeRepository.findAll();
        return roomTypes;
    }



    public int getRoomTypeRent(String roomTypeName) {
        List<RoomType> roomTypes =  roomTypeRepository.findAll();
        for (RoomType abc : roomTypes) {
            if (abc.getRoomTypeName().equalsIgnoreCase(roomTypeName))
            {
                return abc.getRoomTypeRent();
            }

        }
        return 0;

    }
    public int getRoomTypeRentFromLocation(String roomTypeLocation) {
        List<RoomType> roomTypes =  roomTypeRepository.findAll();
        int c=0;
        for (RoomType abc : roomTypes) {
            if (abc.getRoomTypeLocation().equalsIgnoreCase(roomTypeLocation))
            {
             c = c + abc.getRoomTypeRent();
            }
        }
        return c;

    }
}
