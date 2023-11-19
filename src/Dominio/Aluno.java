package Dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoaFisica {
    private String matricula;
    private LocalDate dataMatricula;
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public Aluno(int codigo, String endereco, String telefone, LocalDate dataInsercao, String nome, String rg,
            String cpf, LocalDate dataNascimento, String matricula, LocalDate dataMatricula) {
        super(codigo, endereco, telefone, dataInsercao, nome, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    @Override
    public void imprimir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Data de Matricula: " + this.dataMatricula);
        System.out.println("Data de Insercao: " + this.dataInsercao);
    }
}