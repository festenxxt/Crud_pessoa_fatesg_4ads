package com.matheus.pessoa.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* A anotação RestController permite definir um controller 
 *  com características REST*/
@RequestMapping("/matriculadisciplina")
/*RequestMapping permite definir uma rota. Caso não 
 * seja informado o método HTTP da rota, ela será definida 
 * para todos os métodos*/
public class MatriculaDisciplinaRest {
	@Autowired
	/*Autowired delega ao Spring Boot a inicialização do objeto*/
	private MatriculaDisciplinaDao matriculadisciplinaDao;
	
	@GetMapping
	/*Metodo Post insere o registro no banco*/
	public List<Disciplina> get(){
		return matriculadisciplinaDao.findAll();
	}
	
	@PostMapping
	/*Metodo Post insere o registro no banco*/
	public void post(@RequestBody Disciplina matriculadisciplina) {
		matriculadisciplinaDao.save(matriculadisciplina);
	}
	
	@DeleteMapping("/id")
	public void delete(@PathVariable("id")Long id) {
		matriculadisciplinaDao.deleteById(id);
	}

}
