package com.entities;

import java.util.Date;

public class System {

    private Integer serialNumber;
    private String type;
    private Integer requiredAccessLevel;
    private Date serviceLife;
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

    public Date getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(Date serviceLife) {
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
