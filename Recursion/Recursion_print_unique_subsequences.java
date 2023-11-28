import java.util.HashSet;

public class Recursion_print_unique_subsequences {
      
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set=new HashSet<>();
        subSequences(str,0,"",set);
    } 
    public static void subSequences(String str,int index,String newStr,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else
            {

            
            System.out.println(newStr);
            set.add(newStr);
            return ;
            }
        }
        char currentChar = str.charAt(index);
        //System.out.println("I am going for first");

        subSequences(str, index+1, newStr+currentChar,set);

        //System.out.println("I am going for second");

        subSequences(str, index+1, newStr,set);
        
    } 

}
