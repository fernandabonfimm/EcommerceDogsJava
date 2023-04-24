package classes.src.User.subclasse;
import java.sql.Date;
import java.time.LocalDate;

import classes.src.User.User;


public class Buyer extends User {
   public Buyer(int id, String name, String cpf, String email, LocalDate birthdate, String salary, String phone) {
      super(id, name, cpf, email, birthdate);
      this.salary = salary;
      this.phone = phone;
   }

   private String salary;
   private String phone;

   public String getSalary() {
      return salary;
   }

   public void setSalary(String salary) {
      this.salary = salary;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

}
