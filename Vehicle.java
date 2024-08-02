public class Vehicle
{
    private String regNo;
    private String vehColor;
    private String vehType;

    public Vehicle( String vehType, String regNo, String vehColor)
    {
        this.regNo=regNo;
        this.vehColor=vehColor;
        this.vehType=vehType;
    }
    public String getRegNo()
    {
        return regNo;
    }
    public String getVehColor()
    {
        return vehColor;
    }
    public String getVehType()
    {
        return vehType;
    }


}
