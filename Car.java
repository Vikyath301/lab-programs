package car;

public class Car {
	private String b;   //brand
	private String m;   //model
	private double p;   //price
	private double mil;  //mileage
	private String ownername;
	private static int totalcars;
	private static String showroomname;
	
	//constructor 1
	Car(String b, String m, double p, double mil ){
		this.b=b;
		this.m=m;
		this.p=p;
		this.mil=mil;
        ownername="vijay";
        totalcars++;
	}
	//constructor 2
	Car(String b, String m, double p, double mil, String owner){
		this.b=b;
		this.m=m;
		this.p=p;
		this.mil=mil;
        this.ownername=ownername;
        totalcars++;
	}
	//getter and setter functions
	 String getownername(String ownername) {
		return ownername;
	}
	void setownername(String ownername) {
		ownername=ownername;
	}
	public void displaydetails() {
		System.out.println("Brand"+b);
		System.out.println("Model"+m);
		System.out.println("Price"+p);
		System.out.println("mileage"+mil);
		System.out.println("owner"+ownername);
			}
	public void UpdatePrice(double newprice) {
		p=newprice;
		}
	public static void showTotalCars() {
		System.out.println("Total cars"+totalcars);
		}
	public static void showShowroomName(String showroomname) {
		System.out.println("Showroom"+showroomname);
	}

}
