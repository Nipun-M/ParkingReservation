public class VehicleFactory 
{
    public static Vehicle getVehicle(String name, String type)
    {
        if(type.equalsIgnoreCase("car"))
        {
            return new FourWheeler(name);
        } 
        else if(type.equalsIgnoreCase("bike"))
        {
            return new TwoWheeler(name);
        }
        else if(type.equalsIgnoreCase("cycle"))
        {
            return new TwoWheeler(name);
        }
        else if(type.equalsIgnoreCase("tempo"))
        {
            return new FourWheeler(name);
        }
        else if(type.equalsIgnoreCase("van"))
        {
            return new FourWheeler(name);
        }
        return null;
    }
}