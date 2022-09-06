package br.com.saurs.ecommerce.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.saurs.ecommerce.models.Departamento;

public interface DepartamentoDAO extends JpaRepository<Departamento, Integer> {
  
}
