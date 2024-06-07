package com.acme.loyalsips.platform.profiles_managment.infrastructure.persistence.jpa.repositories;
import com.acme.loyalsips.platform.profiles_managment.domain.model.aggregates.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    // Métodos para interactuar con la base de datos
}
