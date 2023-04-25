import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import classes.src.Compra.NotaFiscal.NotaFiscal;
import classes.src.Dog.Dog;
import classes.src.Dog.subclasses.Padreador;
import classes.src.Dog.subclasses.Puppy;
import classes.src.SaudeDoAnimal.Alimentacao.Dieta;
import classes.src.SaudeDoAnimal.CarteiraVacinacao.CarteiraVacinacao;
import classes.src.User.subclasse.Buyer;
import classes.src.User.subclasse.Dono;
import classes.src.User.subclasse.Veterinary;

import java.lang.System;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Parte dos pais
        Dog mother = new Dog(1, "Rex", 123456789);
        Dog father = new Dog(2, "Rex", 123456789);

        // Parte do dono do padreador
        Dono dono = new Dono(1, "João", "123.456.789-10", "joao@gmail.com", LocalDate.of(1990, 5, 15),
                "(11) 98765-4321", "Rua A, 123");
        Padreador padreador = new Padreador(4, "Rex Sr", 123456789, father, mother, dono);

        // Parte do veterinário
        Veterinary veterinario = new Veterinary(2, "Fernanda", "123.456.777-01", "fernanda@gmail.com",
                LocalDate.of(2002, 2, 13), "123456", "987654321");
        
        Dieta dieta = new Dieta();

        // Parte dos filhotes
        CarteiraVacinacao carteira = new CarteiraVacinacao();
        Puppy filhote = new Puppy(456, "Fido", 789, padreador, 1.500, carteira, dieta);
        Puppy filhote2 = new Puppy(458, "Isabel", 689, padreador, 2.500, carteira, dieta);
        Puppy filhote3 = new Puppy(459, "Joaninha", 889, padreador, 3.000, carteira, dieta);
        Puppy filhote4 = new Puppy(460, "Amelio", 889, padreador, 1.000, carteira, dieta);

        // Parte da compra e do comprador de filhotes
        System.out.println("Digite o nome do comprador: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do comprador: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite o e-mail do comprador: ");
        String email = scanner.nextLine();

        System.out.println("Digite a data de nascimento do comprador (no formato dd/MM/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.println("Digite o salário do comprador: ");
        String salario = scanner.nextLine();

        System.out.println("Digite o telefone do comprador: ");
        String telefone = scanner.nextLine();
        Buyer comprador = new Buyer(random.nextInt(), nome, cpf, email, dataNascimento, salario, telefone);

        System.out.println("Filhotes disponiveis:");
        System.out.println("1 " + filhote.getName() + " - Pedigree: " + filhote.getPedigree() + " - Valor: R$ "
                + filhote.getValorFilhote());
        System.out.println("2 " + filhote2.getName() + " - Pedigree: " + filhote2.getPedigree() + " - Valor: R$ "
                + filhote2.getValorFilhote());
        System.out.println("3 " + filhote3.getName() + " - Pedigree: " + filhote3.getPedigree() + " - Valor: R$ "
                + filhote3.getValorFilhote());
        System.out.println("4 " + filhote4.getName() + " - Pedigree: " + filhote4.getPedigree() + " - Valor: R$ "
                + filhote4.getValorFilhote());
        System.out.print("Digite o número do filhote escolhido: ");
        int escolha = scanner.nextInt();
        Puppy filhoteEscolhido;
        switch (escolha) {
            case 1:
                filhoteEscolhido = filhote;
                break;
            case 2:
                filhoteEscolhido = filhote2;
                break;
            case 3:
                filhoteEscolhido = filhote3;
                break;
            case 4:
                filhoteEscolhido = filhote4;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        LocalDate dataEntrega = LocalDate.of(2023, 4, 30);
        LocalDate dataCompra = LocalDate.of(2023, 4, 23);
        double valorFilhote = 1500.0;
        double valorEntrega = 100.0;
        String formaEntrega;
        String nomeFilhote = filhoteEscolhido.getName();
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
