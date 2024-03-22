package Day6;

public class Sony extends Television{

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		  System.out.println("Sony TV turned on");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		  System.out.println("Sony TV turned off");

	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
        System.out.println("Sony TV channel changed to: " + channel);

	}

	public static void main(String[] args) {
		Television tv = new Sony();
		tv.turnOn();
		tv.turnOff();
		tv.changeChannel(2);	
	}
}
