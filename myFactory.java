import java.util.*;
public class myFactory
{
	public static getVehicle(String name)
	{
		if(name=="twoWheeler")
			return new twoWheeler();
		else if(name=="fourWheeler")
			return new fourWheeler();
		else if(name=="truck")
			return new truck();
	
	
	
	}
}
