package id.ac.polinema.quiz2;

/**
 * Perjalanan ojek motor tanpa layanan asuransi perjalanan.
 */
public class BikeRide extends Ride {

    private static final double FARE_PER_KM = 2500.0;

    public BikeRide(String rideId, Passenger passenger, double distanceKm) {
        super(rideId, passenger, distanceKm);
    }

    @Override
    public double calculateFare() {
        return getDistanceKm() * FARE_PER_KM;
    }
}
