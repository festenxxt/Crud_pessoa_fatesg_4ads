package com.matheus.pessoa.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
/* A anotação RestController permite definir um controller 
 *  com características REST*/
@RequestMapping("/disciplina")
/*RequestMapping permite definir uma rota. Caso não 
 * seja informado o método HTTP da rota, ela será definida 
 * para todos os métodos*/
public class DisciplinaRest {
	@Autowired
	/*Autowired delega ao Spring Boot a inicialização do objeto*/
	private DisciplinaDao disciplinaDao;
	@GetMapping
	/*Metodo Get recebe o resgistro e o mostra*/
	public List<Disciplina>get(){
		return disciplinaDao.findAll();
	}
	@PostMapping
	/*Metodo Post insere o registro no banco*/
	public void post(@RequestBody Disciplina disciplina) {
		disciplinaDao.save(disciplina);
	}
	@DeleteMapping("/(id)")
	public void delete(@PathVariable("id") Long id) {
		disciplinaDao.deleteById(id);
	}

}
