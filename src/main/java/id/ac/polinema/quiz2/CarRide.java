package id.ac.polinema.quiz2;

/**
 * Perjalanan ojek mobil yang menyediakan layanan asuransi perjalanan.
 */
public class CarRide extends Ride implements Insurable {

    private static final double FARE_PER_KM = 4000.0;
    private static final double FIXED_INSURANCE_FEE = 3000.0;

    public CarRide(String rideId, Passenger passenger, double distanceKm) {
        super(rideId, passenger, distanceKm);
    }

    @Override
    public double calculateFare() {
        return getDistanceKm() * FARE_PER_KM;
    }

    @Override
    public double insuranceFee() {
        return FIXED_INSURANCE_FEE;
    }
}
