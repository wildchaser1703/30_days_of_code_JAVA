import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Bitwise{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(int i = 0; i < t; i++){
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            
            int max = 0;
            
            for(int j=1; j<N; j++){
                for(int k=i+1;k<N;k++){
                    int s = j&k;
                    if (s < K && max < s){
                        max = s;
                    }
                }
            }

            System.out.println(max);
        }
    }
}
