package com.example.masterclass3.masterclass3.repositorio.crudRepository;

import com.example.masterclass3.masterclass3.entidades.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {

    @Query("SELECT c.client, COUNT (c.client) FROM Reservation as c GROUP BY c.client ORDER BY COUNT (c.client) DESC")
    public List<Object[]> countTotalReservationByClient();

    // SELECT*FROM Reservation WHERE startDate AFTER dateOne AND devolutionDate BEFORE dateTwo;
    public List<Reservation> findAllByStartDateAfterAndDevolutionDateBefore(Date dateOne, Date dateTwo);


    // SELECT*FROM Reservation WHERE status = cancelled
    public List<Reservation> findAllByStatus(String status);

}
