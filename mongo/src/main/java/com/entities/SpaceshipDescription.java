package com.entities;

import com.annotation.CascadeSave;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "spaceship_description")
public class SpaceshipDescription {

    @Id
    private String id;

    @DBRef
    @Field("system")
    @CascadeSave
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
