public abstract class Parking
{
	protected int nRows;
	protected int nColumns;
	Cell cells[][];

	public abstract double getPricePerTick(Vehicle vehicle);
	public int getNumberOfRows()
	{
		return this.nRows;
	}
	public int getNumberOfColumns()
	{
		return this.nColumns;
	}
	public String toString()
	{
		String returnString = "";
		for(int i=0;i<nRows;i++)
		{
			for(int j=0;j<nColumns;j++)
			{
				returnString+=this.cells[i][j];
			}
			returnString+='\n';
		}
		return returnString;
	}
}