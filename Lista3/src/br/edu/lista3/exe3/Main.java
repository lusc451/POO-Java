package br.edu.lista3.exe3;

import br.edu.lista3.exe3.classes.Flight;
import br.edu.lista3.exe3.classes.Passenger;
import br.edu.lista3.exe3.classes.Reservation;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger(1, "Lucas Antunes", "999.999.999-99");
        Passenger p2 = new Passenger(2, "Emily", "111.111.111-11");
        Reservation r1 = new Reservation(100, LocalDate.now(), p1);
        Reservation r2 = new Reservation(200, LocalDate.now(), p2);

        Flight flight = new Flight(1000, "Guarulhos", "Orlando");
        flight.addReservation(r1);
        flight.addReservation(r2);

        System.out.println(flight);
    }
}