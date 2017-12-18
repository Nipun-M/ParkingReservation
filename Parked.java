public class Parked extends State
{
	public Vehicle accept(Vehicle vehicle)
	{
		return vehicle;
	}
	public Vehicle release(Vehicle vehicle)
	{
		return null;
	}
	public State toggle()
	{
		return new Available();
	}
	public String toString()
	{
		return "Parked";
	}
}