import Dominio.Aluno;

import Servico.AlunoServico;

public class App{
    public static void main(String[] args) throws Exception{
        System.out.println("### Inicio de Execução. ###");
        AlunoServico serv = new AlunoServico();
        for (Aluno aluno : serv.Listar()){
            System.out.println("--------------------------");
            aluno.imprimir();
        }
        System.out.println("### Final da Execução. ###");
    }
}