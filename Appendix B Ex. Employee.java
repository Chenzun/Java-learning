
public class Employee {

  private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee ( String myFirstName, String myLastName, double myMonthlySalary)
	{
		firstName = myFirstName;
		lastName = myLastName;
		monthlySalary = myMonthlySalary;
	}
	
	public void setFirstName ( String myFirstName )
	{
		firstName = myFirstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName ( String myLastName )
	{
		lastName = myLastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setMonthlySalary ( double myMonthlySalary )
	{
		monthlySalary = myMonthlySalary;
	}
	
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	
	public double getYearlySalary()
	{
		return getMonthlySalary() * 12;
	}
	
	public double ariseYearlySalary()
	{
		return getYearlySalary() * 110 / 100;
	}
	
}
