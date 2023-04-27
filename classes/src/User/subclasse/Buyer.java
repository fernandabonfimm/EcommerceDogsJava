package src.User.subclasse;
import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;

import src.Dog.subclasses.Puppy;
import src.User.User;


public class Buyer extends User {
   private double salary;
   private String phone;
   private LinkedList<Puppy> dogsOwned;
   public Buyer(int id, String name, String cpf, String email, LocalDate birthdate, double salary, String phone) {
      super(id, name, cpf, email, birthdate);
      this.salary = salary;
      this.phone = phone;
      dogsOwned = new LinkedList<Puppy>();
   }


   public void buyDog(Puppy dog) {
      if(dog.getValorFilhote() > salary){
         System.out.println("Não tem dinheiro para comprar o dog");
         return;
      } else {
         dogsOwned.add(dog);
         dog.setResevado();
      }

   }
   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

}
