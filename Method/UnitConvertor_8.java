package Method;

public class UnitConvertor_8 {
	public static double convertYardsToFeet(double yards) {
		return yards*3;
	}
	public static double convertFeetToYards(double feet) {
		return feet* 0.333333;
	}
	public static double convertmetersToInches(double meters) {
		return meters * 39.3701;
	}
	public static double convertInchesTometers(double inches) {
		return inches * 0.0254;
	}
	public static double convertInchesToCM(double inches) {
		return inches * 2.54;
	}
	
	public static void main(String[] args) {
		System.out.println("Yard To Feet: " + convertYardsToFeet(98.6));
        System.out.println("Feet To Yard: " + convertFeetToYards(37));
        System.out.println("Meters To inches: " + convertmetersToInches(150));
        System.out.println("Inches To Meters: " + convertInchesTometers(68));
        System.out.println("Inches To CM: " + convertInchesToCM(5));

	}

}
