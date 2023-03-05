package com.sevice.apt.tpt.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ROOM_TYPE")
public class RoomType {

    @Id
    @Column (name = "ROOM_TYPE_ID")
    private  int RoomTypeID;

    @Column(name = "ROOM_TYPE_NAME")
    private String RoomTypeName;

    @Column (name = "ROOM_TYPE_LOCATION")
    private String RoomTypeLocation;

    @Column(name = "ROOM_TYPE_RENT")
    private  int RoomTypeRent;

}
