import java.util.HashSet;

public class HashsetProblem2 {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        int a[]={1,2,3,4,5,6,7,8};
        int b[]={2,4,6,8,10};
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        int count=0;
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                count++;
                 set.remove(b[i]);
            }
        }
        
        System.out.println(set);
        System.out.println(count);
    }
}
