package br.com.saurs.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Departamento {
  
  @Column
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer codigo;

  @Column(length = 50, nullable = false, columnDefinition = "TEXT")
  private String nome;

  @Column(nullable = false, columnDefinition = "TEXT")
  private String descricao;

  public Integer getCodigo() {
    return codigo;
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
