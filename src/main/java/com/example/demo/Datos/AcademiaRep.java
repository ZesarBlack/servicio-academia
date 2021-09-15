package com.example.demo.Datos;


//import java.util.Collection;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Component
@Repository
public interface AcademiaRep extends JpaRepository<DatosAcademia, Integer> {
	
	
}
