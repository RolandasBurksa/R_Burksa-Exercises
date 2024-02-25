package lt.techin.rolandasburksa;

import lt.techin.exam.FlightManager;
import lt.techin.exam.Passenger;
import lt.techin.exam.Plane;
import lt.techin.exam.SeatIsOccupiedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightManagerTestImplementation implements FlightManager {

    private final List<Plane> plainList = new ArrayList<>();
    private final List<Passenger> passengerList = new ArrayList<>();

    @Override
    public Plane registerPlane(String s, int i) {   // Valina pateikta
        if(s == null || i < 0 || s.isEmpty()){      // turi buti i <= 0, butu +1 testas
            throw  new IllegalArgumentException();
        }
        Plane newPlaine = new Plane(s, i);
        plainList.add(newPlaine);
        return newPlaine;
    }

    @Override
    public List<Plane> getRegisteredPlanes() {
        return new ArrayList<>(plainList);
    }

    @Override
    public Plane getPlaneById(String s) {  // Nevalina nepateikta
        for (Plane plane : plainList) {
            if (plane.getPlaneId().equals(s)) {
                return plane;
            }
        }
        return null;
    }

//        String plainID;
//        for (Plane plainID : plainList)

//        return null;
//    }

    @Override
    public Passenger registerPassenger(String s, String s1, int i) {  // Nevalina pateikta
        Passenger newPassenger = new Passenger(s, s1, i);
        passengerList.add(newPassenger);
        return newPassenger;
    }

    @Override
    public void registerPassengerOnPlane(Plane plane, int i, Passenger passenger) throws SeatIsOccupiedException {
        if (plane.isSeatOccupied(i)) {                     // Valina nepateikta
            throw new SeatIsOccupiedException();
        }
        plane.registerPassenger(i, passenger);
    }


    @Override
    public List<Passenger> getPassengersOnPlane(String s) {    // Valina nepateikta
        Plane plane = getPlaneById(s);
        if (plane != null) {
            return plane.getPassengers();
        } else {
            return Collections.emptyList();
        }
    }

//        if (plainList.isEmpty()) {
//            return null;
//        }



    @Override
    public Passenger getOldestPassengerOnPlane(String s) {     // Valina nepateikta
        Plane plane = getPlaneById(s);

        if (plane != null) {
            List<Passenger> passengers = plane.getPassengers();
            if (!passengers.isEmpty()) {

                Passenger oldestPassenger = passengers.get(0);

                for (Passenger passenger : passengers) {
                    if (passenger.getPassengerAge() > oldestPassenger.getPassengerAge()) {
                        oldestPassenger = passenger;
                    }
                }
                return oldestPassenger;
            }
        }

        return null;
    }

//        if (plainList.isEmpty()) {
//            return null;
//        }
////        Plane theOldestPassenger = plainList.get(0);
////        for (Plane passenger : plainList)
////            if (passenger.g)
////

//                return null;
//    }

    @Override
    public double getAverageAgeOfPassengersOnPlane(String s) {   // Valina nepateikta

        Plane plane = getPlaneById(s);
        if (plane != null) {
            List<Passenger> passengers = plane.getPassengers();
            if (!passengers.isEmpty()) {
                int sumAge = 0;
                for (Passenger passenger : passengers) {
                    sumAge += passenger.getPassengerAge();
                }
                return (double) sumAge / passengers.size();
            }
        }
        return 0;
    }
}
