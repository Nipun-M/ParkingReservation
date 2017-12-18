public class LevelZero extends Parking
{
	public static LevelZero instance=new LevelZero();
	private LevelZero()
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
			return 10;
		} else if(vehicle.size<=8){
			return 20;
		} else if(vehicle.size<=12){
			return 30;
		} else {
			return 40;
		}
	}

	public String toString()
    {
        return "LevelZero";
    }
}