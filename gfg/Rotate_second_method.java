package gfg;

public class Rotate_second_method {
    
    public static void main(String args[]){
        int a[]={1,2,4,5,6,7,8};
        int d = 2;
        int[] rottatedArray=new int[a.length];
        int newIndex;
        //int count=0;
        for(int i=0;i<a.length;i++){
            newIndex = (i-d+(a.length))%(a.length);
            rottatedArray[newIndex]=a[i];
            //count++;
        }
        
         for(int k=0;k<a.length;k++){
         System.out.print(rottatedArray[k]+" ");
     }
     System.out.println();
    }
}
