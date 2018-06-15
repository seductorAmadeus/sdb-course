package com.sbd.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table("operations_history")
public class OperationHistory {

    @PrimaryKey("operation_id")
    private UUID operationId;

    @Column("description")
    private String description;

    @Column("operation_date")
    private Date time;

    @Column("operation_result")
    private int operationResult;

    @Column("report")
    private String report;

    public UUID getOperationId() {
        return operationId;
    }

    public void setOperationId(UUID operationId) {
        this.operationId = operationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(int operationResult) {
        this.operationResult = operationResult;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
