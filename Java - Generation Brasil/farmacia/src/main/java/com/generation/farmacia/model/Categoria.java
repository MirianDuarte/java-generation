package com.generation.farmacia.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.farmacia.controller.ProdutoController;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
@JsonIgnoreProperties("categoria")
	private List<ProdutoController> produto;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
@NotBlank(message = "O preenchimento é obrigatório e não pode ser deixado em branco")
@Size(min = 5, max = 100)
	private String nome;
	
@NotBlank(message = "O preenchimento é obrigatório e não pode ser deixado em branco")
@Size(min = 10, max = 500)
	private String descricao;

	public List<ProdutoController> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoController> produto) {
		this.produto = produto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}