package System;

import java.sql.Date;

import Veterinarian.Veterinarian;

public class System {
    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian(1, "CRMV-1234", "John Smith", "123.456.789-00", "john.smith@email.com", Date.valueOf("1990-01-01"));
    }
}
