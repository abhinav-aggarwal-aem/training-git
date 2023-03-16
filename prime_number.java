import java.util.Scanner;
public class Demo {
    public static void main(String []args)
    {
        Scanner src =new Scanner(System.in);
        System.out.println("Enter Number :");
        int num =src.nextInt();
        int i=1,count=0;
        while(num>=i)
        {
           if(num%i==0)
           {
            count++;
           }
           i++;
        }
        if(count==2)
        {
            System.out.println("This is Prime Number !!");
        }
        else {
            System.out.println("This is not Prime Number !!");
        }
    }
}
