package com.example.test.dao;

import com.example.test.model.Vessel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository("Dao")
public class VesselDataAccessService implements VesselDao {

    private static List<Vessel> DB = new ArrayList<>();

    @Override
    public int insertVessel(String name, Date date, Date receivedDate, double latitude, double longitude, double speed) {
        DB.add(new Vessel(name,date,receivedDate,latitude,longitude,speed));
        return 1;
    }

    @Override
    public List<Vessel> selectAllVessels() {
        return DB;
    }
}
