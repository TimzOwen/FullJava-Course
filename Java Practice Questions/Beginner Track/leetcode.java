import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        
        // 1. inouts
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d  = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);



        // 2. string format
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(String.format("%-15s%03d",s1,x));
        }
        System.out.println("================================");

        // 3. 
    }

}
