package fakedb;
import java.time.LocalDate;
import java.util.ArrayList;
import Dominio.Leao;

public class LeaoFakedb extends BaseFakedb <Leao>{
    @Override
    protected void CarregarDados(){
        this.tabela = new ArrayList<Leao>();

        this.tabela.add(new Leao
    }
    public LeaoFakedb(){
        super();
    }
}