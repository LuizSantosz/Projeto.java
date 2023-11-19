package Dominio;

import java.time.LocalDate;

public class Fornecedor extends BasePessoaJuridica  {
    private String servico;
    private LocalDate dataContrato;
    private int periodoEmMeses;
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public LocalDate getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }
    public int getPeriodoEmMeses() {
        return periodoEmMeses;
    }
    public void setPeriodoEmMeses(int periodoEmMeses) {
        this.periodoEmMeses = periodoEmMeses;
    }
    public Fornecedor(int codigo, String endereco, String telefone, LocalDate dataInsercao, String nomeFantasia,
            String razaoSocial, String cnpj, String ie, LocalDate dataAbertura, String servico, LocalDate dataContrato,
            int periodoEmMeses) {
        super(codigo, endereco, telefone, dataInsercao, nomeFantasia, razaoSocial, cnpj, ie, dataAbertura);
        this.servico = servico;
        this.dataContrato = dataContrato;
        this.periodoEmMeses = periodoEmMeses;
    }
    @Override
    public void imprimir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Insercao: " + this.dataInsercao);
        System.out.println("Nome Fantasia: " + this.nomeFantasia);
        System.out.println("Razao Social: " + this.razaoSocial);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscricao Estadual: " + this.ie);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Servico: " + this.servico);
        System.out.println("Data do Contrato: " + this.dataContrato);
        System.out.println("Periodo em Meses: " + this.periodoEmMeses);
    }
}