public class Cell4Wheeler extends Cell
{
	public Cell4Wheeler()
	{
		state=new Available();
		vehicle=null;
		overallPrice=0.0;
		sizeConstraint=new Size4WheelerConstraint();
	}
	public String toString()
	{
		return "fourWheelerSpace";
	}
}