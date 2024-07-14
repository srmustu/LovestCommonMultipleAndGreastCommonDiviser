import java.util.Scanner;
public class LovestCommonMultipleAndGreastCommonDiviser {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String m1,m2,m3,m4,m5;
        int num1,num2,ebob = 1,ekok = 1,smallNumber,bigNumber;

        m1 = "Enter your first number : ";
        m2 = "Enter your second number : ";
        m3 = "Greatest common divisor : ";
        m4 = "Least common multiple : ";
        m5 = "Validation formula : ";

        System.out.print(m1);
        num1 = entry.nextInt();
        System.out.print(m2);
        num2 = entry.nextInt();

        if (num1 > num2){
            smallNumber = num2;
            bigNumber = num1;
        }else {
            smallNumber = num1;
            bigNumber = num2;
        }

        int i = smallNumber;
        while(i >= 1){
            if ((smallNumber % i == 0) && (bigNumber % i == 0)){
                ebob = i;
                System.out.println(m3 + ebob);
                break;
            }
            i--;
        }

        int j = smallNumber;
        while (j <= (smallNumber * bigNumber)){
            if ((j % smallNumber == 0) && (j % bigNumber == 0)){
                ekok = j;
                System.out.println(m4 + ekok);
                break;
            }
            j ++;
        }

        System.out.print(m5 +((num1 *num2)/ebob));



    }

}
