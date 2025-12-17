import static java.lang.Math.*;

public class VolumeOfEarth {
    public static void main(String[] args) {
        final double RADIUS_EARTH = 6378;
        double volumeInCubicKM, volumeInCubicMiles;

	//Calculating volume of earth in cubic kilometres
        volumeInCubicKM = (4.0/3) * PI * pow(RADIUS_EARTH, 3);
	//Calculating volume of earth in cubic miles
	volumeInCubicMiles = volumeInCubicKM * pow(0.6213, 3);

        //Displaying the results
        System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKM + " and cubic miles is " + volumeInCubicMiles);
    }
}