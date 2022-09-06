package br.com.saurs.ecommerce.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.saurs.ecommerce.daos.DepartamentoDAO;
import br.com.saurs.ecommerce.models.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

  @Autowired
  private DepartamentoDAO dao;

  @Override
  public Departamento criarNovo(Departamento novo) {
    if (novo.getNome() != null) {
      return dao.save(novo);
    }
    return null;
  }

  @Override
  public Departamento atualizarDados(Departamento dados) {
    if (dados.getCodigo() != null && dados.getNome() != null) {
      return dao.save(dados);
    }
    return null;
  }

  @Override
  public ArrayList<Departamento> buscarTodos() {
    return (ArrayList<Departamento>)dao.findAll();
  }

  @Override
  public Departamento buscarPorId(Integer id) {
    return dao.findById(id).orElse(null);
  }

  @Override
  public void excluirDepartamento(Integer id) {
    dao.deleteById(id);   
  }
  
}
