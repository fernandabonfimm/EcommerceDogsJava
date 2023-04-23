package ExamLab;

import java.util.Date;

public class DisplasiaExams extends ExamLab{
    private String displasiaProb;

    public  DisplasiaExams (Date dateDone, boolean done, String dogName, String doctorName,
                            String unity, double value, String description, String type, String displasiaProb) {
        super(dateDone,done,dogName,doctorName);
        this.displasiaProb = displasiaProb;
    }

    public String getDisplasiaProb() {
        return displasiaProb;
    }

    public void setDisplasiaProb(String displasiaProb) {
        this.displasiaProb = displasiaProb;
    }
}
