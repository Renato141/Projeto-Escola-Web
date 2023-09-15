package com.ifce.br.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Nba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	
	private String cpf;
	private String nome;
	private String celular;
	private String data;
	private String senha;
	private String usuario;
	private int nota1;
	private int nota2;
	private int nota3;
	private int media;
	private String situacao;
	
	private String lnome;
	private String lcpf;
	private String ldata;
	private String ltelefone;
	private String lemail;
	private String lendereco;
	private String lcidade;
	private String luf;
	private String lsenha;
	


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	private String nome_disciplina;
	private String turma;


	public String getNome_disciplina() {
		return nome_disciplina;
	}


	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}


	public String getTurma() {
		return turma;
	}


	public void setTurma(String turma) {
		this.turma = turma;
	}
	

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

	public int getNota1() {
		return nota1;
	}


	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}


	public int getNota2() {
		return nota2;
	}


	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	

	public int getNota3() {
		return nota3;
	}


	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}


	public int getMedia() {
		return media;
	}


	public void setMedia(int media) {
		this.media = media;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public String getLnome() {
		return lnome;
	}


	public void setLnome(String lnome) {
		this.lnome = lnome;
	}


	public String getLcpf() {
		return lcpf;
	}


	public void setLcpf(String lcpf) {
		this.lcpf = lcpf;
	}


	public String getLdata() {
		return ldata;
	}


	public void setLdata(String ldata) {
		this.ldata = ldata;
	}


	public String getLtelefone() {
		return ltelefone;
	}


	public void setLtelefone(String ltelefone) {
		this.ltelefone = ltelefone;
	}


	public String getLemail() {
		return lemail;
	}


	public void setLemail(String lemail) {
		this.lemail = lemail;
	}


	public String getLendereco() {
		return lendereco;
	}


	public void setLendereco(String lendereco) {
		this.lendereco = lendereco;
	}


	public String getLcidade() {
		return lcidade;
	}


	public void setLcidade(String lcidade) {
		this.lcidade = lcidade;
	}


	public String getLuf() {
		return luf;
	}


	public void setLuf(String luf) {
		this.luf = luf;
	}


	public String getLsenha() {
		return lsenha;
	}


	public void setLsenha(String lsenha) {
		this.lsenha = lsenha;
	}
	
	
	
}
