package br.com.livraria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.livraria.repository.entity.Autor;

@Repository
public interface CategoriaRepository extends CrudRepository<Autor, Long> {

}
