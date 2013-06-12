
public class EmployeeTest {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//initialize employee information
		Employee employee1 = new Employee ( "Stephen", "Young", 23000);
		Employee employee2 = new Employee ( "Marcus", "Wang", 27000);
		
		System.out.printf("第一個員工的名字是%s", employee1.getFirstName());
		System.out.printf(" %s\n", employee1.getLastName());
		System.out.printf("年薪是%.2f\n\n", employee1.getYearlySalary());
		
		System.out.printf("第二個員工的名字是%s", employee2.getFirstName());
		System.out.printf(" %s\n", employee2.getLastName());
		System.out.printf("年薪是%.2f\n\n", employee2.getYearlySalary());

		System.out.println("近年來經濟不景氣，為了提振員工精神，老闆決定加薪!\n");
		System.out.println("以下是調整過的年薪:\n");
		
		System.out.printf("%s", employee1.getFirstName());
		System.out.printf(" %s", employee1.getLastName());
		System.out.printf("的薪水調整為%.2f\n", employee1.ariseYearlySalary());
		
		System.out.printf("%s", employee2.getFirstName());
		System.out.printf(" %s", employee2.getLastName());
		System.out.printf("的薪水調整為%.2f\n", employee2.ariseYearlySalary());
		
		
	}

}
