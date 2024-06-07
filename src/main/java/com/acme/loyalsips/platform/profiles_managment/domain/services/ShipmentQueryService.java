package com.acme.loyalsips.platform.profiles_managment.domain.services;

import com.acme.loyalsips.platform.profiles_managment.application.internal.queryservices.ShipmentQueryServiceImpl;
import com.acme.loyalsips.platform.profiles_managment.domain.model.queries.GetAllShipments;
import com.acme.loyalsips.platform.profiles_managment.domain.model.queries.GetShipmentByIdQuery;
import com.acme.loyalsips.platform.profiles_managment.domain.model.aggregates.Shipment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShipmentQueryService {
    private final ShipmentQueryServiceImpl shipmentQueryService;

    public ShipmentQueryService(ShipmentQueryServiceImpl shipmentQueryService) {
        this.shipmentQueryService = shipmentQueryService;
    }

    public List<Shipment> handle(GetAllShipments query) {
        return shipmentQueryService.getAllShipments();
    }

    public Shipment handle(GetShipmentByIdQuery query) {
        return shipmentQueryService.getShipmentById(query.getId());
    }

    // Otros manejadores de consultas según sea necesario, como buscar por estado, fecha, etc.
}