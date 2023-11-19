package fakedb;
import java.util.ArrayList;
import Dominio.Fornecedor;

public class FornecedorFakedb extends BaseFakedb<Fornecedor>{
    @Override
    protected void CarregarDados(){
        this.tabela = new ArrayList<Fornecedor>();
    }
    public FornecedorFakedb(){
        super();
    }
}