package br.com.fiap.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "tb_livro")
@SequenceGenerator(name = "livro", sequenceName = "SQ_TB_livro", allocationSize = 1)
public class Livro implements Serializable{

	private static final long serialVersionUID = 1L;

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "livro")
	private Long id;
	
	@Column(name="ds_titulo", length=80, nullable=false)
	private String titulo;
	
	@Column(name="ds_autor", length=80, nullable=false)
	private String autor;
	
	@Column(name="nr_edicao", length=5, nullable=false)
	private int edicao;
	
	@Column(name="ano_publicacao")
	private LocalDate anoPublicacao;
	
	@Column(name="dt_cadastro")
	private LocalDate dataCadastro;
	
	@Column(name="dt_atualizacao")
	private LocalDateTime dataAtualizacao;
	
	@Override
	public String toString() {
		return "\nTitulo: " + this.getTitulo()
			+ "\nAutor: " + this.getAutor()
			+ "\nEdicao: " + this.getEdicao()
			+ "\nAnoAtualizacao: " + this.getAnoPublicacao();
			
	}

	//constructor
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	public Livro(String titulo, String autor, int edicao, LocalDate anoPublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
		
	}


	public Livro(LocalDate dataCadastro, LocalDateTime dataAtualizacao) {
		super();
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
	}

	//getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public LocalDate getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(LocalDate anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	
}
