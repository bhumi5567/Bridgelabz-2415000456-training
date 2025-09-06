package method;

public class UnitConverter2 {
    public static double convertFarhenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFarhenheit(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKg(double pounds) { return pounds * 0.453592; }
    public static double convertKgToPounds(double kg) { return kg * 2.20462; }
    public static double convertGallonsToLiters(double gallons) { return gallons * 3.78541; }
    public static double convertLitersToGallons(double liters) { return liters * 0.264172; }

    public static void main(String[] args) {
        System.out.println("100 F = " + convertFarhenheitToCelsius(100) + " C");
        System.out.println("37 C = " + convertCelsiusToFarhenheit(37) + " F");
        System.out.println("50 pounds = " + convertPoundsToKg(50) + " kg");
        System.out.println("20 kg = " + convertKgToPounds(20) + " pounds");
        System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("5 liters = " + convertLitersToGallons(5) + " gallons");
    }
}
