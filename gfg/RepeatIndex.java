import java.util.HashMap;

class RepeatIndex {
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer, Integer> fr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (fr.containsKey(arr[i])) {
                System.out.println("i am here to give index"+i);
                fr.put(arr[i],fr.get(arr[i])+1);
                for(int ele:fr.keySet()){
                    if(ele==2){
                        return ReturnIndex(arr,n,ele);
                    }
                }
                
                
            } else {
                System.out.println("I am in first time and index is "+i);
                fr.put(arr[i], 1);
                System.out.println(fr);
                
                
            }
        }
        return -1;
    }
    /*public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer, Integer> fr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (fr.containsKey(arr[i])) {
                fr.put(arr[i], fr.get(arr[i]) + 1);
                if (fr.get(arr[i]) == 2) { // Check if an element has been repeated twice.
                    return ReturnIndex(arr, n, arr[i]);
                }
            } else {
                fr.put(arr[i], 1);
            }
        }
        return -1;
    }*/
    
    public static int ReturnIndex(int arr[], int n, int ele) {
        for (int o = 0; o < n; o++) {
            if (arr[o] == ele) {
                return o;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int n = 12;
        int[] arr = {7 ,4 ,0 ,9 ,4 ,8, 8 ,2 ,4, 5 ,5, 1};
        
        int result = firstRepeated(arr, n);
        if (result != -1) {
            System.out.println("First repeating element found at position: " + result);
        } else {
            System.out.println("No repeating element found.");
        }
    }
}
