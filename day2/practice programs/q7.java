public class q7 {
    public static void main(String[] args) {
        double radiusInkm = 6378;
        double radiusInMiles = radiusInkm * (1/1.6);
        double volumeWithKm = (4.0/3.0) * Math.PI * Math.pow(radiusInkm, 3);
        double volumeWithMiles = (4.0/3.0) * Math.PI * Math.pow(radiusInMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is "+volumeWithKm+" and cubic miles is "+ volumeWithMiles);
    }
}
