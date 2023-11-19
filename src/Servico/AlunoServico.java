package Servico;

import java.util.ArrayList;

import Dominio.Aluno;

import Repositorio.AlunoRepositorio;

public class AlunoServico extends BaseServico<AlunoRepositorio, Aluno> {
     public AlunoServico(){
        this.repositorio = new AlunoRepositorio();
    }

    @Override
    public Aluno Inserir(Aluno tupla){
        return this.repositorio.Create(tupla);
    }

    @Override
    public Aluno Obter(int codigo){
        return this.repositorio.Read(codigo);
    }
   
    public Aluno Exluir(int codigo) {
       return this.repositorio.Delete(codigo);
    }
    @Override
    public ArrayList<Aluno> Listar() {
       return this.repositorio.ReadAll();
    }

    @Override
    public Aluno Atualizar(Aluno tupla) {
       return this.repositorio.Update(tupla);
    }
}