//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Details();
        System.out.println();
        pattern();
        System.out.println();
        prime();
        CTC();
    }
    public static void Details() {

        //Employee Details
        String name = "Sumit Sharma";
        int age = 22;
        String city = "Mumbai";
        float joiningPercentage = 90.02f;
        char performanceGrade;

        System.out.println("Welcome to HDFC Life!");
        System.out.println("Employee: " +name+ " | " + "Age: "+age+ " | "+"City: "+city);
        System.out.println("Joining Percentage: " +joiningPercentage);

        //Performance Rating
        if(joiningPercentage > 90)
        {
            performanceGrade = 'A';
        } else if (joiningPercentage >=75) {
            performanceGrade = 'B';
        } else if (joiningPercentage >= 60) {
            performanceGrade = 'C';
        }else {
            performanceGrade = 'D';
        }
        System.out.println("Performance Grade: " +performanceGrade);

        //HR Feedback
        System.out.print("HR Feedback: ");
        switch (performanceGrade)
        {
            case 'A':
                System.out.println("Star Performance");
                break;
            case 'B':
                System.out.println("Strong Start");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            case 'D':
                System.out.println("Needs Improvement");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }


    public static void pattern()
    {
        System.out.println("----Badge Pattern----");
        for(int i=1;i<=5;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void prime()
    {
        System.out.println("----Prime Numbers----");
        for (int num = 2; num <=50; num++) {
            boolean isPrime = true;
            for(int i =2;i<num/2;i++)
            {
                if(num%i==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(!isPrime) continue;
            System.out.print(num+ " ");
        }
        System.out.println();
    }

    public static void CTC()
    {
        float monthCTC = 58000.50f;
        int monthCTCINT = (int)monthCTC;

        System.out.println("\nMonthly CTC (float): " +monthCTC);
        System.out.println("Monthly CTC (int): " +monthCTCINT);

        float annualCTC = (int)monthCTC*12;
        annualCTC += 10000;
        System.out.println("Annual CTC (int): " +(int)annualCTC);
    }

}