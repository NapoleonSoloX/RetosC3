package com.example.masterclass3.masterclass3.repositorio;

import com.example.masterclass3.masterclass3.entidades.Client;
import com.example.masterclass3.masterclass3.entidades.DTOs.CountClient;
import com.example.masterclass3.masterclass3.entidades.Reservation;
import com.example.masterclass3.masterclass3.repositorio.crudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll() {
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return reservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation p) {
        return reservationCrudRepository.save(p);
    }

    public void delete(Reservation p) {reservationCrudRepository.delete(p);
    }

    //RETO 5
    public List<CountClient> getTopClients(){
        List<CountClient> respuesta = new ArrayList<>();

        List<Object[]> reporte = reservationCrudRepository.countTotalReservationByClient();

        for (int i=0; i<reporte.size(); i++) {
            respuesta.add(new CountClient((Long) reporte.get(i)[1], (Client) reporte.get(i)[0]));
        }
        return respuesta;
    }


    public List<Reservation> getReservationPeriod(Date a, Date b){
        return reservationCrudRepository.findAllByStartDateAfterAndDevolutionDateBefore(a, b);
    }

    public List<Reservation> getReservationByStatus(String status){
        return reservationCrudRepository.findAllByStatus(status);
    }

}
