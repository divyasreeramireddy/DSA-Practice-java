//find the maximum element in array
import java.util.*;

public class Maxelement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner in  = new Scanner(System.in);
    int n = in.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++){
        a[i]=in.nextInt();
        }
        int result= a[0];
        for(int i=1;i<n;i++){
        if(a[i]>result){
            result = a[i];
        }
        }
System.out.print(result);
in.close();
    }
}
