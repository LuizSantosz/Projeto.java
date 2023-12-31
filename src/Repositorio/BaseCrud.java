package Repositorio;

import java.util.ArrayList;

public abstract class BaseCrud<TFakedb, TDominio>{
    protected TFakedb db;
    protected ArrayList<TDominio> dataset;

    public abstract TDominio Create(TDominio instancia);
    public abstract TDominio Read(int codigo);

    public ArrayList<TDominio> ReadAll(){
        return this.dataset;
    }

    public abstract TDominio Uptade (TDominio instancia);
    public abstract TDominio Delete (int codigo);
    }
