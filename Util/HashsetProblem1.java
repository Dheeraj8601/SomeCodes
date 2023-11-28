import java.util.HashSet;
public class HashsetProblem1 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8};
        int b[]={2,4,6,8,10};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!set.contains(a[i])){
            set.add(a[i]);
            }else{
                set1.add(a[i]);
            }
        }
        for(int i=0;i<b.length;i++){
            if(!set.contains(b[i])){
            set.add(b[i]);
            }else{
                set1.add(b[i]);
            }
        }

        System.out.println("Union of two arrays :"+set);
        System.out.println(set.size());
        System.out.println("Intersection Of Two arrays : "+set1);
    }
}
