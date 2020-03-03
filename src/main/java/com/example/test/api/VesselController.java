package com.example.test.api;

import com.example.test.model.Vessel;
import com.example.test.service.VesselService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/vessel")
@RestController
public class VesselController {

    private final VesselService vesselService;

    @Autowired
    public VesselController(VesselService vesselService) {
        this.vesselService = vesselService;
    }

    @PostMapping
    public void addVessel(@RequestBody Vessel vessel) {
        //String name = @JsonProperty("name");

        vesselService.addVessel(vessel);
    }

    @GetMapping
    public List<Vessel> getAllVessels(){
        return vesselService.getAllVessels();
    }
}
