import java.util.*;
public class Staff
{
	HashMap<Vehicle, Cell> record;
	List<Parking> parkingLot;
	public Staff()
	{
		this.record = new HashMap<>();
	 	this.parkingLot = getParkingLot();
	}
	public void park(Vehicle vehicle)
	{
		Vehicle withMe = vehicle;
		Parking floor = null;
		int row = 0, column = 0;
		for(int i=0;i<parkingLot.size() && withMe!=null;i++)
		{	
			floor = parkingLot.get(i);
			System.out.println(floor.toString());
			for(row=0;row<floor.getNumberOfRows() && withMe!=null;row++)
			{
				for(column=0;column<floor.getNumberOfColumns() && withMe!=null;column++)
				{
					System.out.println(row+" "+column);

					withMe = floor.cells[row][column].accept(withMe);
				}
			}
		}
		if(withMe == null)
		{
			record.put(vehicle, floor.cells[row-1][column-1]);
			this.incrementCost();
		}
		else
		{
			System.out.println("Sorry, no space for your vehicle "+withMe.name);
		}
	}

	public Vehicle release(Vehicle vehicle)
	{	
		Cell cell=record.get(vehicle);
		Vehicle retVehicle = cell.release();
		if(retVehicle == null)
		{
			record.remove(retVehicle);
			this.incrementCost();
		}
		return retVehicle;
	}

	private List<Parking> getParkingLot()
	{
		List<Parking> parkingLot=new ArrayList<>();
		parkingLot.add(LevelZero.getInstance());
		parkingLot.add(LevelOne.getInstance());

		return parkingLot;
	}

	private void incrementCost(){
		for(Parking floor:parkingLot)
			for(int row=0;row<floor.getNumberOfRows();row++)
				for(int column=0;column<floor.getNumberOfColumns();column++)
					floor.cells[row][column].incrementCost(floor.getPricePerTick(floor.cells[row][column].vehicle));
	}
}