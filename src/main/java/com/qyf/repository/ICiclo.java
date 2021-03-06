package com.qyf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qyf.model.Ciclo;

@Repository
public interface ICiclo extends JpaRepository<Ciclo, Integer>{
	
	@Query("SELECT c FROM Ciclo c WHERE "+
	"CONCAT(c.id_ciclo, c.titulo, c.numero, c.fecha_ini, c.fecha_fin, c.activo) LIKE %?1%")
	public List<Ciclo> findAll(String key);
}
