package com.matheus.pessoa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/* Uma entity é um objeto leve de domínio persistente
utilizado para representar uma tabela da base de dados, 
sendo que cada instância da entity corresponde a uma linha da tabela*/
public class MatriculaDisciplina {
	@Id
	/*A anotação @Id é utilizada para informar ao JPA
	 *  qual campo/atributo de uma entidade estará relacionado
	 *  à chave primária da respectiva tabela no banco de dados.
	 *  O campo que representa a chave primária pode ser de qualquer
	 *  tipo primitivo do Java, wrappers de tipos primitivos 
	 *  (como Integer e Long) */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*Informamos ao provedor de persistência que os valores
	 * a serem atribuídos ao identificador único serão gerados
	 * pela coluna de auto incremento do banco de dados.
	 * Assim, um valor para o identificador é gerado para cada 
	 * registro inserido no banco. Alguns bancos de dados podem 
	 * não suportar essa opção.*/
	private Long id;
	private String responsavel;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

}
