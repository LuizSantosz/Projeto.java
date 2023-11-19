package fakedb;
import java.util.ArrayList;
import Dominio.Professor;

public class ProfessorFakedb extends BaseFakedb<Professor>{
    @Override
    protected void CarregarDados(){
        this.tabela = new ArrayList<Professor>();
    }
    public ProfessorFakedb(){
        super();
    }
}