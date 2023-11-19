package Repositorio;

import Dominio.Professor;
import fakedb.ProfessorFakedb;

public class ProfessorRepositorio extends BaseCrud<ProfessorFakedb, Professor> {
    
    
    @Override
    public Professor Create(Professor instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }

     @Override
    public Professor Read(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Read'");
    }


    @Override
    public Professor Uptade(Professor instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Uptade'");
    }

    @Override
    public Professor Delete(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
}