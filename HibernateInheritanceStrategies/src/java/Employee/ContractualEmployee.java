
package Employee;

public class ContractualEmployee extends EmployeeType
{
    private Double HourlyRate;
    private Float ContractPeriod;
    
    //Getters & Setters
    public Double getHourlyRate()
    {
        return HourlyRate;
    }
    public void setHourlyRate(Double HourlyRate)
    {
        this.HourlyRate = HourlyRate;
    }
    
    public Float getContractPeriod()
    {
        return ContractPeriod;
    }
    public void setContractPeriod(Float ContractPeriod)
    {
        this.ContractPeriod = ContractPeriod;
    }
}
