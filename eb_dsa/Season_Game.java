import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if (n>=1&&n<=12)
        {
            if(n>=3&&n<=5)
            {
                System.out.println("Spring");
            }
            else if(n>=6&&n<=8)
            {
                System.out.println("Summer");
            }
            else if(n>=9&&n<=11)
            {
                System.out.println("Autumn");
            }
            else
            {
                System.out.println("Winter");
            }
        }
        else
        {
            System.out.println("Invalid");
        }
        
    }
}
