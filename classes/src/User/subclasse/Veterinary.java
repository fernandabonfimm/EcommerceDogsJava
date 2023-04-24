package classes.src.User.subclasse;

import java.time.LocalDate;

import classes.src.User.User;

public class Veterinary extends User {
    private String crmv;
    private String phone;

    public Veterinary(int id, String name, String cpf, String email, LocalDate birthdate, String crmv, String phone) {
        super(id, name, cpf, email, birthdate);
        this.crmv = crmv;
        this.phone = phone;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
