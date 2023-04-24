import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import classes.src.Compra.NotaFiscal.NotaFiscal;
import classes.src.Dog.Dog;
import classes.src.Dog.subclasses.Padreador;
import classes.src.Dog.subclasses.Puppy;
import classes.src.User.subclasse.Buyer;
import classes.src.User.subclasse.Dono;
import classes.src.User.subclasse.Veterinary;

import java.lang.System;

public class Main{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Dog mother = new Dog(1, "Rex", 123456789);
            Dog father = new Dog(2, "Rex", 123456789);
            Dono dono = new Dono(1, "João", "123.456.789-10", "joao@gmail.com", LocalDate.of(1990, 5, 15),
                    "(11) 98765-4321", "Rua A, 123");
            Padreador padreador = new Padreador(4, "Rex Sr", 123456789, father, mother, dono);
            Puppy filhote = new Puppy(456, "Fido", 789, padreador);
            Veterinary veterinario = new Veterinary(2, "Fernanda", "123.456.777-01", "fernanda@gmail.com",
                    LocalDate.of(2002, 2, 13), "123456", "987654321");
            Buyer comprador = new Buyer(4, "Joselina", "123.456.777-11", "joselina@gmail.com",
                    LocalDate.of(2000, 10, 14), "R$ 1000,00", "(11) 98765-4321");

            LocalDate dataEntrega = LocalDate.of(2023, 4, 30);
            LocalDate dataCompra = LocalDate.of(2023, 4, 23);
            double valorFilhote = 1500.0;
            double valorEntrega = 100.0;
            String formaEntrega;
            String nomeFilhote = filhote.getName();
            String nomeComprador = comprador.getName();
            String cpfComprador = comprador.getCpf();

            System.out.println("Digite o tipo de entrega (1 - Retirada em loja, 2 - Entrega normal): ");
            int entrega = scanner.nextInt();

            if (entrega == 1) {
                formaEntrega = "Retirada em loja";
                valorEntrega = 0.0;
                dataEntrega = null;
            } else if (entrega == 2) {
                formaEntrega = "Entrega normal";
            } else {
                System.out.println("Opção inválida!");
                return;
            }

            NotaFiscal notaFiscal = new NotaFiscal(valorFilhote, valorEntrega, formaEntrega, dataEntrega, dataCompra,
            nomeFilhote, nomeComprador, cpfComprador);

                    Double valorTotal = notaFiscal.getValorFilhote() + notaFiscal.getValorEntrega();

            System.out.println("Deseja imprimir nota fiscal da compra? (1 - Sim, 2 - Não): ");
            int imprimir = scanner.nextInt();

            if (imprimir == 1) {
                System.out.println("Nota fiscal gerada com sucesso!");
                System.out.println("Nome do comprador: " + notaFiscal.getNomeComprador());
                System.out.println("CPF do comprador: " + notaFiscal.getCpfComprador());
                System.out.println("Nome do filhote: " + notaFiscal.getNomeFilhote());
                System.out.println("Data da compra: " + notaFiscal.getDataCompra());
                System.out.println("Data da entrega: " + notaFiscal.getDataEntrega());
                System.out.println("Forma de entrega: " + notaFiscal.getFormaEntrega());
                System.out.println("Valor da entrega: " + notaFiscal.getValorEntrega());
                System.out.println("Valor do filhote: " + notaFiscal.getValorFilhote());
                System.out.println("Valor total: " + valorTotal);
                System.out.println("Valor total: " + valorTotal);
            } else {
                System.out.println("Nota fiscal não impressa!");
            }
        }
    }
}