/*Question : Given an integer array of size n,find all elements that appear more than n/3 times */

import java.util.HashMap;

public class HashMapProblem1{
    public static void main(String args[]){
        int num[]={1,5,5,1,5,1,1,1,5,5,5,5};
        PrintRepeatFrequency(num);
    }
    static void PrintRepeatFrequency(int a[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }

            for(int key:map.keySet()){
                if(map.get(key) > (a.length)/3){
                    System.out.println(key);
                }
            }
        
    }
}