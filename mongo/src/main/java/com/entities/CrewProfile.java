package com.entities;

import org.springframework.data.annotation.Id;

public class CrewProfile {

    @Id
    private String id;

    private PersonalData personalData;

    private String expeditionMemberProfile;

    private Integer responsibleForSystem;

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public String getExpeditionMemberProfile() {
        return expeditionMemberProfile;
    }

    public void setExpeditionMemberProfile(String expeditionMemberProfile) {
        this.expeditionMemberProfile = expeditionMemberProfile;
    }

    public Integer getResponsibleForSystem() {
        return responsibleForSystem;
    }

    public void setResponsibleForSystem(Integer responsibleForSystem) {
        this.responsibleForSystem = responsibleForSystem;
    }

}