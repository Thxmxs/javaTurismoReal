/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Funcionario;

/**
 *
 * @author alx4a
 */
public class DetalleTour {
    
    private int idDetalleTour;
    Reserva reserva;
    private int reservaIdReserva;
    Tour tour;
    private int tourIdTour;

    public DetalleTour() {
    }

    public DetalleTour(int idDetalleTour, Reserva reserva, int reservaIdReserva, Tour tour, int tourIdTour) {
        this.idDetalleTour = idDetalleTour;
        this.reserva = reserva;
        this.reservaIdReserva = reservaIdReserva;
        this.tour = tour;
        this.tourIdTour = tourIdTour;
    }

    public int getIdDetalleTour() {
        return idDetalleTour;
    }

    public void setIdDetalleTour(int idDetalleTour) {
        this.idDetalleTour = idDetalleTour;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getReservaIdReserva() {
        return reservaIdReserva;
    }

    public void setReservaIdReserva(int reservaIdReserva) {
        this.reservaIdReserva = reservaIdReserva;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public int getTourIdTour() {
        return tourIdTour;
    }

    public void setTourIdTour(int tourIdTour) {
        this.tourIdTour = tourIdTour;
    }
    
}
