public class Size4WheelerConstraint extends SizeConstraint
{
	public Vehicle accept(Vehicle vehicle)
	{
		if(vehicle.size==4)
			return null;
		else
			return vehicle;
	}
}