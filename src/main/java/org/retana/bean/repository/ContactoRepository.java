package org.retana.bean.repository;

import java.util.List;

import org.retana.bean.Contacto;
import org.springframework.data.repository.CrudRepository;
import java.lang.Integer;

public interface ContactoRepository extends CrudRepository<Contacto, Integer>{
	public List<Contacto> findAll();
	List<Contacto> findByIdContacto(Integer idcontacto);
}
