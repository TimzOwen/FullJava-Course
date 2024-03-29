import java.io.BufferedReader;
import java.io.InputStreamReader;
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

       
        // 3. Multiplication tables
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1; i<=10; i++){
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        bufferedReader.close();



        // 4. loops 
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a + b;
            int k = 2;
            
            System.out.print(sum+" ");
            for(int j=0;j<n-1;j++){
                sum= sum + b*k;
                k=k*2;
                System.out.print(sum+" ");
            }
            System.out.print("\n");
            }
        in.close();


        // 5. Application context - Spring 
    }

}
