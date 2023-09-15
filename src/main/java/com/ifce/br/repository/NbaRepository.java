package com.ifce.br.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Nba;

@Repository
public interface NbaRepository extends JpaRepository<Nba,Long> {

	@Query("SELECT n FROM Nba n WHERE n.cpf = :cpf")
    Nba buscarPorCpf(@Param("cpf") String cpf);
	
	List<Nba> findByNome(String nome);
	
	List<Nba> findByUsuario(String usuario);
	
}
