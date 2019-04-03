package roadToGreatness;

public class SpeedConverter {
    public static void main(String[] args) {

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesToHour = 0;
        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
            milesToHour = Math.round(kilometersPerHour / 1.609);
        }
        return milesToHour;
    }
}
