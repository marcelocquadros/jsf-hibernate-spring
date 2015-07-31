package br.ufc.quixada.npi.web;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.service.ContatoService;

@Named
public class ContatoController {

	@Inject
	private ContatoService cs;

	public ContatoController() {
		super();
	}

	public String insere() {
		return "inserir";
	}
	
	public void inserir() {
		try {
			cs.insere();
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}

	}

	public List<Contato> getContatos() {
		return cs.findAll();
	}

}
