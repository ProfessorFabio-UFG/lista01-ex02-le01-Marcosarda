package poo1.exercicio2;

public class Morador {
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    private String codigoAcesso;

    public Morador(String nome,
                   String cpf,
                   String celular,
                   String dataNascimento,
                   String sexo,
                   String bloco,
                   String apartamento,
                   String codigoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoAcesso;
    }

    public void mostrarDados() {
        System.out.printf(
            "Nome: %s | CPF: %s | Celular: %s | Nasc.: %s | Sexo: %s | Bloco: %s | Apt.: %s | Código: %s%n",
            nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso
        );
    }
}
