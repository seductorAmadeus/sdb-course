package com.sbd.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Table("ship_equipment")
public class ShipEquipment {

    @PrimaryKey("equipm_id")
    private UUID equipmentId;

    @Column("description")
    private String description;

    @Column
    private int weight;

    public UUID getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(UUID equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
