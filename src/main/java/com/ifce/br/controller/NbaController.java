package com.ifce.br.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Nba;
import com.ifce.br.repository.NbaRepository;
import com.ifce.br.service.NbaService;



@Controller
public class NbaController {
	
	@Autowired
	private NbaService nbaService;
	
	@Autowired
    private NbaRepository NbaRepository;
	
	
	@GetMapping("nba/formulario_professor")
	public ModelAndView formulario_pro() {
		ModelAndView mv = new ModelAndView("formulario_professor");
		mv.addObject("nba", new Nba());
		return mv;
	}
	
	@RequestMapping("/nba/salvar_professor")
	public ModelAndView salvar_pro(Nba nba) {
		nbaService.cadastrarNba(nba);
		
		ModelAndView mv = new ModelAndView("redirect:/nba/formulario_professor");
		return mv;
	}
	
	
	
	@GetMapping("nba/formulario_aluno")
	public ModelAndView formulario_alu() {
		ModelAndView mv = new ModelAndView("formulario_aluno");
		mv.addObject("nba", new Nba());
		return mv;
	}
	
	@RequestMapping("/nba/salvar_aluno")
	public ModelAndView salvar_alu(Nba nba) {
		nbaService.cadastrarNba(nba);
		
		ModelAndView mv = new ModelAndView("redirect:/nba/formulario_aluno");
		return mv;
	}
	
	@GetMapping("nba/formulario_disciplina")
	public ModelAndView formulario_dis() {
		ModelAndView mv = new ModelAndView("formulario_disciplina");
		mv.addObject("nba", new Nba());
		return mv;
	}
	
	@RequestMapping("/nba/salvar_disciplina")
	public ModelAndView salvar_dis(Nba nba) {
		nbaService.cadastrarNba(nba);
		
		ModelAndView mv = new ModelAndView("redirect:/nba/formulario_disciplina");
		return mv;
	}
	
	
	@GetMapping("/nba/listar")
	public ModelAndView listarNba() {
		List<Nba> nbas = nbaService.listarNba();
		
		ModelAndView mv = new ModelAndView("lista_banco_dados");
		
		mv.addObject("listaNba", nbas);
		
		return mv;
	}
	
	@GetMapping("/nba/login")
	public ModelAndView loginForm() {
	    
		ModelAndView mv = new ModelAndView("pagina_login");
		
		mv.addObject("nba", new Nba());
	    return mv;
	}
	
	
    
	@PostMapping("/nba/login")
	public ModelAndView login(@ModelAttribute Nba nba) {
	    
		if (nba.getCpf().equals("111.111.111-11") && nba.getSenha().equals("123")) {
			ModelAndView mv = new ModelAndView("redirect:/nba/inicial_diretor");
	        return mv; 
		}
		
		if (nba.getCpf().equals("222.222.222-22") && nba.getSenha().equals("123")) {
			ModelAndView mv = new ModelAndView("redirect:/nba/inicial_coordenador");
	        return mv; 
		}
		
		Nba nbaBD = NbaRepository.buscarPorCpf(nba.getCpf());
	    
	    
	    if (nbaBD != null && nbaBD.getSenha().equals(nba.getSenha())) {
	        ModelAndView mv = new ModelAndView("redirect:/nba/inicial_professor");
	        return mv;
	        
	    } else {
	        ModelAndView mv = new ModelAndView("redirect:/nba/login");
	        return mv;
	    }
	}
	
	
	@GetMapping("/nba/inicial_diretor")
	public ModelAndView pagdir() {
	    
		ModelAndView mv = new ModelAndView("pagina_inicial_dir");
		
	    return mv;
	}
	
	
	@GetMapping("/nba/inicial_coordenador")
	public ModelAndView pagcor() {
	    
		ModelAndView mv = new ModelAndView("pagina_inicial_cor");
		
	    return mv;
	}
	
	@GetMapping("/nba/inicial_professor")
	public ModelAndView pagpro() {
	    
		ModelAndView mv = new ModelAndView("pagina_inicial_pro");
		
	    return mv;
	}
	
	@GetMapping("/nba/pesquisa")
	public ModelAndView alterar() {
	    
		ModelAndView mv = new ModelAndView("formulario_pesquisa");
		
	    return mv;
	}
	
	@GetMapping("/nba/visualizar")
	public ModelAndView pesquisarPorNome(@RequestParam("nome") String nome) {
	    List<Nba> nbas = NbaRepository.findByNome(nome);
	    ModelAndView mv = new ModelAndView("tabela");
	    mv.addObject("nbas", nbas);
	    return mv;
	}
	
	@RequestMapping("/nba/atualizar/{codigo}")
	public ModelAndView atualizarNba(@PathVariable Long codigo) {
		Optional<Nba> nba = nbaService.atualizarNba(codigo);
		
		ModelAndView mv = new ModelAndView("alterar_dados");
		mv.addObject("nba", nba);
		
		return mv;
	}
	
	@RequestMapping("/nba/alterar")
	public ModelAndView altear(Nba nba) {
		nbaService.cadastrarNba(nba);
		
		ModelAndView mv = new ModelAndView("redirect:/nba/pesquisa");
		return mv;
	}
	
	@GetMapping("/nba/turmas")
	public ModelAndView turmas() {
	    
		ModelAndView mv = new ModelAndView("visualizar_turmas");
		
	    return mv;
	}
	
	@GetMapping("/nba/horario")
	public ModelAndView horario() {
	    
		ModelAndView mv = new ModelAndView("horario");
		
	    return mv;
	}
	
	@GetMapping("/nba/turma_6A")
	public ModelAndView turma6A() {
		List<Nba> nbas = nbaService.listarNba();
		
		ModelAndView mv = new ModelAndView("lista_turma");
		
		mv.addObject("listaNba", nbas);
		
		return mv;
	}
	
	@GetMapping("/nba/disciplinas")
	public ModelAndView inserirnotas() {
	    
		ModelAndView mv = new ModelAndView("inserir_notas");
		
	    return mv;
	}
	
	
	
	
	
	@GetMapping("/nba/login_lds")
	public ModelAndView loginlds() {
	    
		ModelAndView mv = new ModelAndView("login_lds");
		
		mv.addObject("nba", new Nba());
	    return mv;
	}
	
	@GetMapping("petshop/lds_cad")
	public ModelAndView formulario_ldscad() {
		ModelAndView mv = new ModelAndView("lds_cad");
		mv.addObject("nba", new Nba());
		return mv;
	}
	
	@RequestMapping("/nba/salvar_usuario")
	public ModelAndView salvar_usu(Nba nba) {
		nbaService.cadastrarNba(nba);
		
		ModelAndView mv = new ModelAndView("redirect:/nba/login_lds");
		return mv;
	}
}
