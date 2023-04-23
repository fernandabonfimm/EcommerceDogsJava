package ExamLab;

import java.util.Date;

public abstract class ExamLab {
    private Date dateDone;
    private boolean done;
    private String dogName;
    private String doctorName;

    public  ExamLab(Date dateDone,boolean done,String dogName, String doctorName)
    {
        this.dateDone = dateDone;
        this.done = done;
        this.dogName = dogName;
        this.doctorName = doctorName;

    }
    public Date getDateDone() {
        return dateDone;
    }

    public void setDateDone(Date dateDone) {
        this.dateDone = dateDone;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
