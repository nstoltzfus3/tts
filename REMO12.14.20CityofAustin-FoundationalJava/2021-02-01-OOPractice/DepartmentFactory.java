



// The DepartmentFactory definition
public class DepartmentFactory

{
    public enum DepartmentNames
    {
        SERVICE,
        FINANCE,
        SALES
    }
    public static Department CreateDepartment(DepartmentNames name)
    {
        Department d = null;

        if (name == null)
            return null;

        switch(name)
        {
            case SERVICE:
                d = new ServiceDepartment();
                break;
            case SALES:
                d = new SalesDepartment();
                break;
            case FINANCE:
                // team of lawyers
                // math/risk analysis team
                d = new FinanceDepartment();
                break;
            default:
                // no op
        }
        return d;
    }

    public static void main() {
        Department d = CreateDepartment(DepartmentNames.FINANCE);
    }

}
