public class Size2WheelerConstraint extends SizeConstraint
{
	public Vehicle accept(Vehicle vehicle)
	{
		if(vehicle.size==2)
			return null;
		else
			return vehicle;
	}
}