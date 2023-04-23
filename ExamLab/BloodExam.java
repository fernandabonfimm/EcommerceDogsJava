package ExamLab;

import java.util.Date;

public class BloodExam extends ExamLab {
    private String unity;
    private double value;
    private String description;
    private String type;

    public BloodExam(Date dateDone,boolean done,String dogName, String doctorName,
                     String unity, double value, String description, String type){
        super(dateDone,done,dogName,doctorName);
        this.unity = unity;
        this.value = value;
        this.description = description;
        this.type = type;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
