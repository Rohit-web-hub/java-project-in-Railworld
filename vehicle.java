package vehicle;

public abstract class vehicle
{
	abstract void demo();
}
class Car extends vehicle
{
	void demo()
	{
	System.out.println("car start with powerbutton");
	}
	
}
class Scooter extends vehicle
{
	void demo()
	{
	System.out.println("scooter start with self");
	}
	public static void main(String[] args)
{
	Car c=new Car();
	c.demo();
	Scooter s=new Scooter();
	s.demo();
	}
}
