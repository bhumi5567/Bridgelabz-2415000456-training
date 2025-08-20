package programming_elements;
public class volume_of_earth {
	public static void main (String[] args) {
		
		double r=6378.0;
		double volume=(4.0/3.0)*Math.PI*Math.pow(r,3);
		double rmiles=r*.621;
		double vmiles=(4.0/3.0)*Math.PI*Math.pow(rmiles,3);
		System.out.printf("The volume of earth in cubic kilometers is %.2f%n ",volume);
		System.out.printf("The volume of Earth in cubic miles is %.2f ", vmiles);
	}

}

