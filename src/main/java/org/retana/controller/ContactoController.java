package org.retana.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.retana.bean.Contacto;
import org.retana.bean.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactoController {
	@Autowired
	private ContactoRepository contactoRepository;
	@CrossOrigin(origins = "*")
	@RequestMapping(name="/contacto",method=RequestMethod.GET)
	public List<Contacto> doList(){
		return contactoRepository.findAll();
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(name="/contacto",method=RequestMethod.POST)
	public void doAdd(@RequestBody Contacto nuevo){
		contactoRepository.save(nuevo);
	}
	@CrossOrigin(origins="*")
	@RequestMapping(name="/contacto",method=RequestMethod.DELETE)
	public void doDelete(@RequestParam Integer id){
		contactoRepository.delete(contactoRepository.findByIdContacto(id));
	}
}
