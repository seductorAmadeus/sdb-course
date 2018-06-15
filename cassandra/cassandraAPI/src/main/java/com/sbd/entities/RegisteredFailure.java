package com.sbd.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Table("registered_failures")
public class RegisteredFailure {

    @PrimaryKey("failure_id")
    private UUID failureId;

    @Column("registration_time")
    private Date time;

    @Column("description")
    private String description;

    public UUID getFailureId() {
        return failureId;
    }

    public void setFailureId(UUID failureId) {
        this.failureId = failureId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
