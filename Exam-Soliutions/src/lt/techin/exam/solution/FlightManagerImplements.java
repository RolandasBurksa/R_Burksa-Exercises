package lt.techin.exam.solution;

import lt.techin.exam.FlightManager;
import lt.techin.exam.Passenger;
import lt.techin.exam.Plane;
import lt.techin.exam.SeatIsOccupiedException;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FlightManagerImplements implements FlightManager {

    private List<Plane> planes = new ArrayList<>();
    @Override
    public Plane registerPlane(String planeId, int planeSeatNumber) {
        if (planeId == null) {
            throw new NullPointerException();
        } else if (planeId.isEmpty() || planeSeatNumber <= 0) {
            throw new IllegalArgumentException();
        } else {
            Plane plane = new Plane(planeId, planeSeatNumber);
            planes.add(plane);
            return plane;
        }
    }

    @Override
    public List<Plane> getRegisteredPlanes() {
        if (planes.isEmpty()){
            throw new NoSuchElementException();
        } else {
            return planes;
        }
    }

    @Override
    public Plane getPlaneById(String planeId) {
        if (planeId == null){
            throw new NullPointerException();
        }
        for (Plane plane : planes) {
            if (plane.getPlaneId().equals(planeId)){
                return plane;
            }
        }
        return null;
    }

    @Override
    public Passenger registerPassenger(String passengerName, String passengerSurname, int passengerAge) {
        if (passengerName == null || passengerSurname == null) {
            throw new NullPointerException();
        } else if (passengerName.isEmpty() || passengerSurname.isEmpty() || passengerAge <= 0) {
            throw new IllegalArgumentException();
        } else {
            return new Passenger(passengerName, passengerSurname, passengerAge);
        }
    }

    @Override
    public void registerPassengerOnPlane(Plane planeId, int planeSeatNumber, Passenger passenger) throws SeatIsOccupiedException {
        for (Plane plane : planes) {
            if (plane.isSeatOccupied(planeSeatNumber)){
                throw new SeatIsOccupiedException();
            } else {
                plane.registerPassenger(planeSeatNumber, passenger);
            }
        }
    }

    @Override
    public List<Passenger> getPassengersOnPlane(String planeId) {
        for (Plane plane : planes){
            if (plane.getPlaneId().equals(planeId)){
                return plane.getPassengers();
            }
        }
        return null;
    }

    @Override
    public Passenger getOldestPassengerOnPlane(String planeId) {
        int oldestPassengerAge = 0;
        Passenger oldestPassenger = null;
        for (Plane plane : planes){
            if (plane.getPlaneId().equals(planeId)){
                List<Passenger> passengers = plane.getPassengers();
                for (Passenger passenger : passengers){
                    if (passenger.getPassengerAge() > oldestPassengerAge){
                        oldestPassengerAge = passenger.getPassengerAge();
                        oldestPassenger = passenger;
                    }
                }
            }
        }
        return oldestPassenger;
    }

    @Override
    public double getAverageAgeOfPassengersOnPlane(String planeId) {
        double totalAge = 0.0;
        for (Plane plane : planes){
            if (plane.getPlaneId().equals(planeId)){
                for (Passenger passenger : plane.getPassengers()){
                    totalAge += passenger.getPassengerAge();
                }
                return totalAge / plane.getPassengers().size();
            }
        }
        return 0.0 ;
    }
}