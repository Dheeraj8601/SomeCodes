public class Recursion_Print_subsequences {
    public static void main(String args[]){
        String str = "abc";
        subSequences(str,0,"");
    } 
    public static void subSequences(String str,int index,String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return ;
        }
        char currentChar = str.charAt(index);
        //System.out.println("I am going for first");

        subSequences(str, index+1, newStr+currentChar);

        //System.out.println("I am going for second");

        subSequences(str, index+1, newStr);
        
    }
}


//time complexity :- O(2^n)