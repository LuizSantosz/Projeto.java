package Dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns extends BaseIdentificador {
    protected LocalDate dataInsercao;

    public LocalDate getDataInsercao(){
        return dataInsercao;
    }
    public void setLocalDate(LocalDate dataInsercao){
        this.dataInsercao = dataInsercao;
    }
    public BaseDadosComuns (int codigo, LocalDate dataInsercao){
        super(codigo);
        this.dataInsercao = dataInsercao;
    }
}
