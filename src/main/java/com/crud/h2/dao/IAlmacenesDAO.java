package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Almacenes;

/**
 * @author David
 *
 */
public interface IAlmacenesDAO extends JpaRepository<Almacenes, Long>{

}
