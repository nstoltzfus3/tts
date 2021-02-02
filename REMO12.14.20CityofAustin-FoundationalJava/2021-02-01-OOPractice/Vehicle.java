

public abstract class Vehicle {

    public enum VehicleClassification
    {
        NEW,
        USED,
        OFF_LEASE,
        SHUTTLE,
        LOANER,
        PARTS_RUNNER
    }

    public enum VehicleClassification2
    {
        NEW(true, true),
        USED(false, true),
        OFF_LEASE(true, true),
        SHUTTLE(true, false),
        LOANER(false, false),
        PARTS_RUNNER(true, true);

        private boolean warranty;
        private boolean freeService;


        public boolean WarrantyOffered()
        {
            return warranty;
        }

        public boolean FreeServiceOffered()
        {
            return freeService;
        }

        // constructor must be private or have no modifier
        private VehicleClassification2(boolean warranty, boolean freeService)
        {
            this.warranty = warranty;
            this.freeService = freeService;
        }
    }

    private VehicleClassification vehicleClass;

    public void setVehicleClass(VehicleClassification theClass)
    {
        this.vehicleClass = theClass;
    }

    public VehicleClassification getVehicleClass()
    {
        return this.vehicleClass;
    }

    // in the Vehicle class
    public void printVehicleType()
    {
        String type = "NOT SET";
        switch (this.vehicleClass)
        {
            case NEW:
                type="New Car";
                break;
            case USED:
                type = "User Car";
                break;
            case OFF_LEASE:
                type = "Leased Car";
                break;
            case SHUTTLE:
                type = "Dealer Shuttle";
                break;
            case LOANER:
                type = "Dealer Service Loaner";
                break;
            case PARTS_RUNNER:
                type = "Parts runner";
                break;
            default:
                break;
        }
        System.out.println("This car type is: " + type);
    }
}
