package com.example.masterclass3.masterclass3.controlador;


import com.example.masterclass3.masterclass3.entidades.Admin;
import com.example.masterclass3.masterclass3.entidades.DTOs.CountClient;
import com.example.masterclass3.masterclass3.entidades.DTOs.CountStatus;
import com.example.masterclass3.masterclass3.entidades.Reservation;
import com.example.masterclass3.masterclass3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
        }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation p){ return reservationService.update(p);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable ("id") int id){
        return reservationService.delete (id);
    }

    @GetMapping("/report-clients")
    public List<CountClient> getReportTopClients(){
        return reservationService.getTopClients();
    }

    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getReportReservationsDate(@PathVariable("dateOne") String dateOne, @PathVariable("dateTwo") String dateTwo ){
        return reservationService.getReservationPeriod(dateOne, dateTwo);
    }

    @GetMapping("/report-status")
    public CountStatus getReportStatusReservations(){
        return reservationService.getReservationsByStatus();
    }


}
