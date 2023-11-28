package gfg;

public class Rotate_arra_gfg {
    public static void main(String args[]){
        int a[]={1,2,4,5,6,7,8};
        int d = 2;
        for(int i=0;i<d;i++){
            int temp = a[0];
            for(int j=0;j<a.length-1;j++){
                a[j] = a[j+1];
                a[j+1]=temp;
            }
            if(i == (d-1)){
               System.out.println("The final array after rotation is :");
            }
            else{
                System.out.println("Araay after "+(i+1)+" rotation ");
            }
            for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
            
        }
        
    }
}
