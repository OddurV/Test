package com.example.test.dao;

import com.example.test.model.Vessel;

import java.util.Date;
import java.util.List;

public interface VesselDao {

    int insertVessel(String name, Date date, Date receivedDate, double latitude, double longitude, double speed);

    List<Vessel> selectAllVessels();
}
