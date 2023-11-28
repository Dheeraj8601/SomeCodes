

class Solution
{
    
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int f=0,j=0,fi=0,li=0;
        int flag=0;
        
     for(int i=0;i<n;i++){
         f +=arr[i];
        
             while(f>s && j<i){
             f-=arr[j];
             
             j++;}
             
        
          if(f==s){
             
             list.add(j+1);
             list.add(i+1);
             return list;
         }
     }
     
     list.add(-1);
     
     return list;
       
    }
}

gff