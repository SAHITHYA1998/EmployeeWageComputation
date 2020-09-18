import java.util.Scanner;

public class EmpWageClassMethod
{

                public static final int FULL_TIME=1;
                public static final int PART_TIME=0;
						
					public static void calculateEmpWage(String company,int wagePerHr,int numbOfWorkingDays,int numbWorkingHrs)
					{
						 int currentWorkingHour=0;
                        int currentWorkingday=0;
                        int salary,workingHr=0;
                        int totalSalary=0;

                        while( numbOfWorkingDays>=currentWorkingday && numbWorkingHrs>=currentWorkingHour )
                        {
                                int random=(int)Math.floor(Math.random()*10)%3;
                                switch(random)
                                {
                                        case FULL_TIME:
                                               // System.out.println("employee is present");
                                                workingHr=8;
                                                break;
                                        case PART_TIME:
                                                //System.out.println("Part Time");
                                                workingHr=4;
                                                break;
                                        default:
                                                workingHr=0;
                                 }
                                        currentWorkingday++;
                                        salary=workingHr*wagePerHr;
                                         totalSalary+=salary;
                                        //System.out.println("Wage: "+salary);
                        }
                        System.out.println("Total computed salary for "+company+" "+totalSalary);

					}
               
					 public static void main(String[] args)
                {
							System.out.println("please enter company name:");
							Scanner sc=new Scanner(System.in);
							String company=sc.nextLine();

							System.out.println("please enter numberofworkingdays:");
                     int numbOfWorkingDays=sc.nextInt();

							calculateEmpWage(company,numbOfWorkingDays,20,30);
							calculateEmpWage("Microsoft",20,20,30);
							
                }
}
