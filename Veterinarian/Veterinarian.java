package Veterinarian;

import User.User;
import java.sql.Date;

public class Veterinarian extends User  {
    private int ID;
    private String CRMV;
    
    public Veterinarian(int ID, String CRMV, String name, String cpf, String email, Date birthdate){
        super(name, cpf, email, birthdate);
        this.CRMV = CRMV;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getCRMV() {
        return CRMV;
    }
    public void setCRMV(String cRMV) {
        CRMV = cRMV;
    }

}
