public class QuickSort {
    public static int partition(int arr[],int low,int high){
      //  System.out.println("Entered partition function");
        int pivot=arr[high];
       // System.out.println("pivot :"+pivot+" of arr["+high+"]");
       // System.out.println("low :"+low);
        int i = low-1;
      //  System.out.println("i :"+i);
        for(int j=low;j<=high;j++){
          //  System.out.println("j :"+j);
            if(arr[j]<pivot){
                i++;
              //  System.out.println("i :"+ i);
                int temp=arr[i];
              //  System.out.println("temp :"+temp);
                arr[i]=arr[j];
               // System.out.println("arr["+i+"] = "+arr[i]);
                arr[j]=temp;
               // System.out.println("arr["+j+"] = "+arr[j]);
            }
        }
       // System.out.println("i after for :"+i);
        i++;
      //  System.out.println("i++ :"+i);
        int temp=arr[i];
       // System.out.println("temp :"+temp);
        arr[i]=pivot;
       // System.out.println("arr["+i+"] = "+arr[i]);
        arr[high]=temp;
       // System.out.println("arr["+high+"] = "+arr[high]);
       // System.out.println("return i :"+i);
        return i;
    }
    public static void quickSort(int arr[],int low,int high){
       // System.out.println("Quick inside sort low ="+low+" and high ="+high);
        if(low<high){
            //System.out.println("low<high : i.e "+low+"<"+high);
            int pindex=partition(arr,low,high);
            //System.out.println("pindex :"+pindex);
            //System.out.println("Quick first sort inside quicksort");
            quickSort(arr, low, pindex-1);
            //System.out.println("Quick second sort inside quicksort");
            quickSort(arr, pindex+1, high);
        }
    }
    public static void main(String args[]){
        int arr[]={2,1,0,9,3};
        int n=arr.length;
        quickSort(arr,0,n-1);

        int i=0;
System.out.println("\n\n\nSorted Array :");
        while(i<n){
            System.out.print(arr[i]+" ");
            i++;
        }

    }
}
