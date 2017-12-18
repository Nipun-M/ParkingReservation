import java.util.*;

public class Client 
{
    public static void main(String args[])
    {
        /*Scanner in=new Scanner(System.in);
        String vehicleName, vehicleType;
        int choice;
        System.out.println("Welcome to Parking Reservation. Please enter your details\n\n\n");
        System.out.println("Please Enter your Vehicle's Name\n");
        vehicleName=in.nextLine();
        System.out.println("Please Enter your Vehicle's Type\n");
        vehicleType=in.nextLine();
        Vehicle vehicle=VehicleFactory.getVehicle(vehicleName, vehicleType);
        //System.out.println(myVehicle.vehicleName);
        boolean value=true;
        Staff staff= new Staff();
        do
        {
            System.out.println("Please enter choice 0 for parking and choice 1 for releasing your space\n");
            choice =  in.nextInt();
            switch(choice)
            {
                case 0:
                        staff.park(vehicle);
                        break;
                case 1:if(vehicle!=null){
                        staff.release(vehicle);
                        value=false;
                        break;}
                        else{
                            System.out.println("No such vehicle\n");
                        }
                            
                            
                default: System.out.println("Wrong choice entered. Please enter the right choice\n");
                
            }
            
        }while(value);*/



        int count=10;
        Staff staff = new Staff();
        Vehicle[] vehicles = new Vehicle[count];
         vehicles[0] = VehicleFactory.getVehicle("XUV","car");
         vehicles[1] = VehicleFactory.getVehicle("CBR150","bike");
         vehicles[2] = VehicleFactory.getVehicle("BSA","cycle");
         vehicles[3] = VehicleFactory.getVehicle("Karizma","bike");
         vehicles[4] = VehicleFactory.getVehicle("VW Polo","car");
         vehicles[5] = VehicleFactory.getVehicle("Traveller","tempo");
         vehicles[6] = VehicleFactory.getVehicle("Pulsar","bike");
         vehicles[7] = VehicleFactory.getVehicle("Octane","cycle");
         vehicles[8] = VehicleFactory.getVehicle("Ashok Leyland","van");
         vehicles[9] = VehicleFactory.getVehicle("Benz CLK-GTR","car");

        for(int index = 0; index < count; index++) 
            staff.park(vehicles[index]);

       // List<Cell> filledCells = new ArrayList<>();
        //for(Vehicle vehicle : staff.record.keySet())
        //{
         //   filledCells.add(staff.record.get(vehicle));
        //}

        //Collections.shuffle(filledCells);

        //for(Cell cell : filledCells)
        //{
             staff.release(vehicles[0]);
             staff.release(vehicles[1]);
             staff.release(vehicles[4]);
        //}
    }
}