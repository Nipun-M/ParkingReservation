public class LevelOne extends Parking
{
	public static LevelOne instance=new LevelOne();
	private LevelOne()
	{
		nRows = 2;
		nColumns = 2;
		cells=new Cell[nRows][nColumns];
		for(int i=0;i<nRows;i++)
		{
			for(int j=0;j<nColumns/2;j++)
			{
				cells[i][j]=new Cell4Wheeler();
			}
			for(int j=nColumns/2;j<nColumns;j++) 
			{
				cells[i][j] = new Cell2Wheeler();
			}
		}
	}
	public static Parking getInstance()
	{
		return instance;
	}
	
	public double getPricePerTick(Vehicle vehicle)
	{
		if(vehicle == null) return 0;
		if(vehicle.size<=2){
			return 7;
		} else if(vehicle.size<=6){
			return 17;
		} else if(vehicle.size<=10){
			return 27;
		} else {
			return 37;
		}
	}

	public String toString()
    {
        return "LevelOne";
    }
}