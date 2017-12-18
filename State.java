public abstract class State
{
	public abstract Vehicle accept(Vehicle vehicle);
	public abstract Vehicle release(Vehicle vehicle);
	public abstract State toggle();
}