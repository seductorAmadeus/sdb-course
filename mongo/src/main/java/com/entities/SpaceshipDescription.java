package com.entities;

public class SpaceshipDescription {
    private System system;

    private String description;

    private String flightReadinessStatus;

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlightReadinessStatus() {
        return flightReadinessStatus;
    }

    public void setFlightReadinessStatus(String flightReadinessStatus) {
        this.flightReadinessStatus = flightReadinessStatus;
    }
}
