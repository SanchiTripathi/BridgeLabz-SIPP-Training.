package Level_1;

public class Volume_of_earth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm * 0.621371;

        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);
        System.out.println("The volume of Earth in cubic kilometers is " + String.format("%.2f", volumeKm3) +
                " and cubic miles is " + String.format("%.2f", volumeMiles3));
    }
}
