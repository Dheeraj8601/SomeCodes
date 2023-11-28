class insertionSort{
      public static void main(String args[]){
             int[] a={7,8,3,1,2};
             System.out.print("Before Sorting :");
             for(int ele:a){
                  System.out.print(ele+" ");
             }
             int n=a.length;
             for(int i=1;i<n;i++){
                  int current=a[i];
                     int j=i-1;
                   while(j>=0 && current < a[j]){
                         a[j+1]=a[j];
                         j--;
                    }
               a[j+1]=current;
             } 
              System.out.println();
              System.out.print("After  Sorting :");
             
             for(int ele:a){ 
                  System.out.print(ele+" ");
             }
      }
}