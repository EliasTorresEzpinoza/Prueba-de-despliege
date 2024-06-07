package com.acme.loyalsips.platform.profiles_managment.domain.services;

import com.acme.loyalsips.platform.profiles_managment.application.internal.commandservices.ShipmentCommandServiceImpl;
import com.acme.loyalsips.platform.profiles_managment.domain.model.commands.CreateShipmentCommand;
import com.acme.loyalsips.platform.profiles_managment.domain.model.aggregates.Shipment;
import org.springframework.stereotype.Component;

@Component
public class ShipmentCommandService {
    private final ShipmentCommandServiceImpl shipmentCommandService;

    public ShipmentCommandService(ShipmentCommandServiceImpl shipmentCommandService) {
        this.shipmentCommandService = shipmentCommandService;
    }

    public Shipment handle(CreateShipmentCommand command) {
        Shipment shipment = new Shipment(
                command.getUserId(),
                command.getDestination(),
                command.getDescription(),
                command.getDateTime(),
                command.getStatus()
        );
        return shipmentCommandService.createShipment(shipment);
    }

    // Otros manejadores de comandos según sea necesario, como para actualizar o eliminar un envío
}