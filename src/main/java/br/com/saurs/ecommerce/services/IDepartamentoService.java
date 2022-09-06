package br.com.saurs.ecommerce.services;

import java.util.ArrayList;

import br.com.saurs.ecommerce.models.Departamento;

public interface IDepartamentoService {
  public Departamento criarNovo(Departamento novo);
  public Departamento atualizarDados(Departamento dados);
  public ArrayList<Departamento> buscarTodos();
  public Departamento buscarPorId(Integer id);
  public void excluirDepartamento(Integer id);
}
