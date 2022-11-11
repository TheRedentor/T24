package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.crud.h2.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	public List<Empleado> findByTrabajo(String trabajo);
	
}
