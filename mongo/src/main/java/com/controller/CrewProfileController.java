package com.controller;

import com.entities.CrewProfile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrewProfileController {

    @RequestMapping("/expeditionMemberProfile")
    public CrewProfile getCrewByExpeditionMemberProfile(@RequestParam(value = "name", defaultValue = "") String expeditionMemberProfile) {
        return new CrewProfile();
    }
}
