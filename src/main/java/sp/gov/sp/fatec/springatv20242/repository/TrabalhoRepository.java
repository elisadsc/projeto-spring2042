package sp.gov.sp.fatec.springatv20242.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import sp.gov.sp.fatec.springatv20242.entity.Trabalho;

public interface TrabalhoRepository extends CrudRepository<Trabalho, Long> {

    // Consulta personalizada usando @Query
    @Query("select t from Trabalho t where t.titulo like %:palavra% and t.nota > :nota")
    public List<Trabalho> buscarPorPalavraNoTituloENotaMaiorQue(String palavra, Integer nota);
}
