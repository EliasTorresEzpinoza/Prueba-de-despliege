package com.acme.loyalsips.platform.profiles_managment.domain.model.queries;

public class GetShipmentByIdQuery {
    private Long id;

    // Constructor
    public GetShipmentByIdQuery(Long id) {
        this.id = id;
    }

    // Getter
    public Long getId() {
        return id;
    }
}
