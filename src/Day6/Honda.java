package Day6;

public class Honda extends Bike {

	@Override
	int speed(int speed) {
		// TODO Auto-generated method stub
		return speed;
	}

	public static void main(String[] args) {
		
		Bike b = new Honda();
		
		int speed = b.speed(100);
		System.out.println(speed);
		
		System.out.println(b.name);
	}
}
