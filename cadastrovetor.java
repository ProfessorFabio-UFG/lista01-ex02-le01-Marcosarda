package poo1.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Morador> lista = new ArrayList<>();
        String resp;

        do {
            System.out.println("\n=== Novo Morador ===");
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

            lista.add(new Morador(nome, cpf, celular, data, sexo, bloco, apto, codigo));

            System.out.print("Cadastrar mais um? (s/n): ");
            resp = sc.nextLine().trim().toLowerCase();
        } while (resp.equals("s"));

        System.out.println("\n=== Todos os moradores cadastrados ===");
        for (Morador m : lista) {
            m.mostrarDados();
        }

        sc.close();
    }
}
