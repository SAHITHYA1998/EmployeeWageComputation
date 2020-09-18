public class EmpWageWhileLoop
{

                public static final int WAGE_PER_HR=20;
                public static final int FULL_TIME=1;
                public static final int PART_TIME=0;
                public static final int NUMBER_OF_WORKING_DAYS=20;
                public static final int NUMBER_OF_HOURS=100;
                public static void main(String[] args)
                {
                        int currentWorkingHour=0;
                        int currentWorkingday=0;
                        int salary,workingHr=0;
                        int totalSalary=0;

                        while( NUMBER_OF_WORKING_DAYS>=currentWorkingday && NUMBER_OF_HOURS>=currentWorkingHour )
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
                                        if( currentWorkingHour!=96 )
                                        {
                                                currentWorkingHour+=workingHr;
                                        }
                                        else
                                        {
                                                currentWorkingHour=currentWorking+4;
                                                salary=4*WAGE_PER_HR;
                                        }
                                        currentWorkingday++;
                                        salary=workingHr*WAGE_PER_HR;
                                         totalSalary+=salary;
                                        //System.out.println("Wage: "+salary);
                        }
                        System.out.println(totalSalary);
                }
}
