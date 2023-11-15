package fakedb;

import java.util.ArrayList;
import Dominio.Cavalo;

public class CavaloFakedb extends BaseFakedb <Cavalo>{
    @Override
    protected void CarregarDados(){
        this.tabela = new ArrayList<Cavalo>();
    }
    public CavaloFakedb(){
        super();
    }
}
