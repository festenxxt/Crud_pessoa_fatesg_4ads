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

@RequestMapping("/curso")
/*RequestMapping permite definir uma rota. Caso não 
 * seja informado o método HTTP da rota, ela será definida 
 * para todos os métodos*/

public class CursoRest {

	@Autowired
	/*Autowired delega ao Spring Boot a inicialização do objeto*/
	
	private CursoDao cursoDao;
	
	@GetMapping
	
	public List<Curso> get(){
		return cursoDao.findAll();
	}
	
	@PostMapping
	/*Metodo Post insere o registro no banco*/
	public void post(@RequestBody Curso curso) {
		cursoDao.save(curso);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		cursoDao.deleteById(id);
	}
	
	
}
