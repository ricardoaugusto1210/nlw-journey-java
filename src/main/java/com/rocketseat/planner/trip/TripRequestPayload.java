package com.rocketseat.planner.trip;

import java.util.List;

//Tipo mais fácil de declarar no java, pois gera automaticamente getters e setters
//Objetos que não são alterados uma vez que foram criados
public record TripRequestPayload(String destination, String starts_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {
}
