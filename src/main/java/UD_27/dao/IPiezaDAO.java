package UD_27.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import UD_27.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{
	
}