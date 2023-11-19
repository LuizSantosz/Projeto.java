package fakedb;
import java.time.LocalDate;

import Dominio.Aluno;

public class AlunoFakedb extends BaseFakedb<Aluno>{
    @Override
    protected void CarregarDados(){
        this.tabela.add(new Aluno(1, "Rua do zezin do pao", "991023456", LocalDate.now(), "Felipe Santos", "123456", "987654", LocalDate.of(1993, 6, 5), "20201001", LocalDate.of(2020,1,20)));
        this.tabela.add(new Aluno(2, "rua do rj", "991023459", LocalDate.now(), "Victor", "125456", "987754", LocalDate.of(1994, 6, 5), "20204001", LocalDate.of(2020,1,20)));
        this.tabela.add(new Aluno(3, "rua expansao de domingo", "991023458", LocalDate.now(), "Del Vale", "123356", "997654", LocalDate.of(1994, 6, 5), "20203001", LocalDate.of(2020,1,20)));
        this.tabela.add(new Aluno(4, "rua do ze da manga", "991023457", LocalDate.now(), "Burgues", "123256", "987354", LocalDate.of(1994, 6, 5), "20202001", LocalDate.of(2020,1,20)));
    }
    public AlunoFakedb(){
        super();
    }
}