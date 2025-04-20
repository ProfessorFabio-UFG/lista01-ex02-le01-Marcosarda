package poo1.exercicio2;

import java.util.Scanner;

public class CadastroSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Cadastro de Morador (individual) ===");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Celular: ");
        String celular = sc.nextLine();

        System.out.print("Data de nascimento: ");
        String data = sc.nextLine();

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Bloco: ");
        String bloco = sc.nextLine();

        System.out.print("Apartamento: ");
        String apto = sc.nextLine();

        System.out.print("Código de acesso: ");
        String codigo = sc.nextLine();

        Morador m = new Morador(nome, cpf, celular, data, sexo, bloco, apto, codigo);
        System.out.println("\n-- Morador cadastrado --");
        m.mostrarDados();

        sc.close();
    }
}
