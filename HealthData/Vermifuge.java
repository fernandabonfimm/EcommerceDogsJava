package HealthData;

import java.sql.Date;

public class Vermifuge {
    private int id;
    private String name;
    private String type;
    private String manufacture;
    private Date expirationDate;
    private Date manufacturingDate;
    private Date whenApplied;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getWhenApplied() {
        return whenApplied;
    }

    public void setWhenApplied(Date whenApplied) {
        this.whenApplied = whenApplied;
    }
}
