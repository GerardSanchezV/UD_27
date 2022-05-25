package UD_27.service;

import java.util.List;

import UD_27.dto.Pieza;

public interface IPiezaService {

	//Metodos del CRUD
		public List<Pieza> listarPiezas(); 
		
		public Pieza guardarPieza(Pieza pieza);	
		
		public Pieza piezaXID(int id); 
		
		public Pieza actualizarPieza(Pieza pieza); 
		
		public void eliminarPieza(int id);
	

}