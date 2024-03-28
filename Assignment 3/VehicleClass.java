class VehicleClass{
	int wheels;
	String company;
	final int year;
	
	public VehicleClass(int wheels,String company,int year) {
		this.wheels=wheels;
		this.company=company;
		this.year=year;
	}
	
	
	
	public static void main(String[] args) {
		
		VehicleClass vc = new VehicleClass(4,"Pagani",2012);
		VehicleClass vc2 = new VehicleClass(2,"Hayabusa",2020);
		
		System.out.println(vc.company);
		System.out.println(vc.year);
		System.out.println(vc.wheels);
		
		System.out.println(vc2.company);
		System.out.println(vc2.year);
		System.out.println(vc2.wheels);
		
		}
}