package car;

public class Showroom {

	public static void main(String[] args) {
		 Car c1 = new Car("toyota", "corolla", 40000, 18.5);
	     Car c2 = new Car("honda", "civic", 60000, 20.0);
	     Car c3 = new Car("hyundai", "i20", 242000, 35.0);

	        c1.displaydetails();
	        c2.displaydetails();
	        c3.displaydetails();

	        c1.setownername("Alice"); 
	        c1.UpdatePrice(16000);

	        System.out.println("After Updates:");
	        c1.displaydetails();

	        Car.showShowroomName("kia carens");
	        Car.showTotalCars();

	}

}
