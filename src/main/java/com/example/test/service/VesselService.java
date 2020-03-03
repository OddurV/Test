package com.example.test.service;

import com.example.test.dao.VesselDao;
import com.example.test.model.Vessel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VesselService {

    private VesselDao vesselDao;

    @Autowired
    public VesselService(@Qualifier("Dao") VesselDao vesselDao) {
        this.vesselDao = vesselDao;
    }

    public int addVessel(Vessel vessel) {
        return vesselDao.insertVessel(vessel.getName(),vessel.getDate(),vessel.getReceivedDate(),vessel.getLatitude(),vessel.getLongitude(),vessel.getSpeed());
    }

    public List<Vessel> getAllVessels(){
        return vesselDao.selectAllVessels();
    }
}
