package UD_27.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UD_27.dto.Pieza;
import UD_27.service.PiezaServiceImpl;


@RestController
@RequestMapping("/api")
public class PiezaController {
	
	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPiezas();
	}
	
	
	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {
		
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	
	@GetMapping("/piezas/{id}")
	public Pieza piezaXID(@PathVariable(name="id") int id) {
		
		Pieza Pieza_xid= new Pieza();
		
		Pieza_xid=piezaServiceImpl.piezaXID(id);
	
		
		return Pieza_xid;
	}
	
	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name="id")int id,@RequestBody Pieza pieza) {
		
		Pieza Pieza_seleccionado= new Pieza();
		Pieza Pieza_actualizado= new Pieza();
		
		Pieza_seleccionado= piezaServiceImpl.piezaXID(id);
		
		Pieza_seleccionado.setNombre(pieza.getNombre());
		
		Pieza_actualizado = piezaServiceImpl.actualizarPieza(Pieza_seleccionado);

		
		return Pieza_actualizado;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eleiminarPieza(@PathVariable(name="id")int id) {
		piezaServiceImpl.eliminarPieza(id);
	}
	
	
}
