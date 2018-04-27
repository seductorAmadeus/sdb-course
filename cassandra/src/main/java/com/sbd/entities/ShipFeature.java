package com.sbd.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("ship_features")
public class ShipFeature {

    @PrimaryKey("feature_id")
    private UUID featureId;

    @Column("description")
    private String description;

    public UUID getFeatureId() {
        return featureId;
    }

    public void setFeatureId(UUID featureId) {
        this.featureId = featureId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShipFeature() {
        super();
    }

    public ShipFeature(UUID id, String description) {
        super();
        this.featureId = id;
        this.description = description;
    }

    public ShipFeature(String description) {
        this.featureId = UUID.randomUUID();
        this.description = description;
    }
}
