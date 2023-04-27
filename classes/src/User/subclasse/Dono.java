package src.User.subclasse;

import java.sql.Date;
import java.time.LocalDate;

import src.User.User;

public class Dono extends User {
    public Dono(int id, String name, String cpf, String email, LocalDate birthdate, String phone, String address) {
        super(id, name, cpf, email, birthdate);
        this.phone = phone;
        this.address = address;
    }

    private String phone;
    private String address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
