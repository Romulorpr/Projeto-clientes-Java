
package com.romulo.clientesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.romulo.clientesapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
