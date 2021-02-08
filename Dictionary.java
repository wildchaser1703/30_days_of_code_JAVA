import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = scn.next();
            int phone = scn.nextInt();
            map.put(name, phone);

        }
        while(scn.hasNext()){
            String s = scn.next();
            if(map.containsKey(s))
                System.out.println(s + "=" + map.get(s));
            else
                System.out.println("Not found");


        }
    }
}