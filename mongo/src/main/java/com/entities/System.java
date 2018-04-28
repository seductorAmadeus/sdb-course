package com.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "system")
public class System {

    @Id
    private ObjectId id;

    private Integer serialNumber;
    private String type;
    private Integer requiredAccessLevel;
    private String serviceLife;
    private Integer permissibleLoad;
    private Integer loading;
    private Integer idleFactor;
    private String workStatus;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRequiredAccessLevel() {
        return requiredAccessLevel;
    }

    public void setRequiredAccessLevel(Integer requiredAccessLevel) {
        this.requiredAccessLevel = requiredAccessLevel;
    }

    public String getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(String serviceLife) {
        this.serviceLife = serviceLife;
    }

    public Integer getPermissibleLoad() {
        return permissibleLoad;
    }

    public void setPermissibleLoad(Integer permissibleLoad) {
        this.permissibleLoad = permissibleLoad;
    }

    public Integer getLoading() {
        return loading;
    }

    public void setLoading(Integer loading) {
        this.loading = loading;
    }

    public Integer getIdleFactor() {
        return idleFactor;
    }

    public void setIdleFactor(Integer idleFactor) {
        this.idleFactor = idleFactor;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

}
