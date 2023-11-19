package fakedb;
import java.util.ArrayList;
import Dominio.Tecnico;

public class TecnicoFakedb extends BaseFakedb<Tecnico>{
    @Override
    protected void CarregarDados(){
        this.tabela = new ArrayList<Tecnico>();
    }
    public TecnicoFakedb(){
        super();
    }
}