package UD_27.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD_27.dao.IProveedorDAO;
import UD_27.dto.Proveedor;


@Service
public class ProveedorServiceImpl implements IProveedorService {
	
	@Autowired
	IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedor> listarProveedores() {
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor pieza) {
		return iProveedorDAO.save(pieza);
	}

	@Override
	public Proveedor proveedorXID(int id) {
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor pieza) {
		return iProveedorDAO.save(pieza);
	}

	@Override
	public void eliminarProveedor(int id) {
		iProveedorDAO.deleteById(id);
	}

}