package Repositorio;

import Dominio.Tecnico;
import fakedb.TecnicoFakedb;

public class TecnicoRepositorio extends BaseCrud<TecnicoFakedb, Tecnico> {
    
    
    @Override
    public Tecnico Create(Tecnico instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }

     @Override
    public Tecnico Read(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Read'");
    }


    @Override
    public Tecnico Uptade(Tecnico instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Uptade'");
    }

    @Override
    public Tecnico Delete(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
}