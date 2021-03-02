package com.matheus.pessoa.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/*Um Repository (Repositório) é um objeto que isola 
 * os objetos ou entidades do domínio do código que acessa 
 * o banco de dados. Um repositório fica entre as regras de 
 * negócio e a camada de persistência: ... Ele provê uma 
 * interface para as regras de negócio onde os objetos são 
 * acessados como em uma coleção*/
public interface DisciplinaDao extends JpaRepository<Disciplina, Long> {

}
