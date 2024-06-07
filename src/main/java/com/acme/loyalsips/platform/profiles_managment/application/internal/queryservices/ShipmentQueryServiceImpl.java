package com.acme.loyalsips.platform.profiles_managment.application.internal.queryservices;

import com.acme.loyalsips.platform.profiles_managment.domain.model.aggregates.Shipment;
import com.acme.loyalsips.platform.profiles_managment.infrastructure.persistence.jpa.repositories.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentQueryServiceImpl {
    private final ShipmentRepository shipmentRepository;

    public ShipmentQueryServiceImpl(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    public Shipment getShipmentById(Long id) {
        return shipmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Envío no encontrado con id: " + id));
    }


}