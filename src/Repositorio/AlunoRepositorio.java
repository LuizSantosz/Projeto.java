package Repositorio;
import Dominio.Aluno;
import fakedb.AlunoFakedb;

public class AlunoRepositorio extends BaseCrud<AlunoFakedb, Aluno>{

    public AlunoRepositorio(){
        this.db = new AlunoFakedb();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Aluno Create (Aluno instancia){
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo ++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }
    @Override
    public Aluno Read(int codigo){
        for (Aluno aluno : this.dataset){
            if (aluno.getCodigo() == codigo)
            return aluno;
        }
        return null;
    }

    @Override
    public Aluno Uptade(Aluno instancia) {
        Aluno alvo = this.Read(instancia.getCodigo());
        alvo.setCpf(instancia.getCpf());
        alvo.setLocalDate(instancia.getDataInsercao());
        alvo.setDataMatricula(instancia.getDataMatricula());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setEndereco(instancia.getEndereco());
        alvo.setMatricula(instancia.getMatricula());
        alvo.setNome(instancia.getNome());
        alvo.setRg(instancia.getRg());
        alvo.setNome(instancia.getNome());
        return alvo;
    }

    @Override
    public Aluno Delete(int codigo){
        Aluno alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }

    public Aluno Update(Aluno tupla) {
        return null;
    }
}
