package com.example.masterclass3.masterclass3.repositorio.crudRepository;

import com.example.masterclass3.masterclass3.entidades.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
