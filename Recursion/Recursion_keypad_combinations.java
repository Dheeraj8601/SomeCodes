public class Recursion_keypad_combinations {
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","xyz"};

    public static void printCombinations(String str,int index,String Combination){
        if(index == str.length()){
            /*if(Combination.equals("dheeraj")){
            System.out.println("My Name is :"+Combination);
        }*/
        System.out.println(Combination);
        if(Combination.equals("om")){
            System.out.println("special word "+Combination);
        }
            
            return;
        }
        char currentChar = str.charAt(index);
       
        String mapping = keypad[currentChar-'0'];
       
        for(int i=0;i<mapping.length();i++){
            
            char d=mapping.charAt(i);
            
            printCombinations(str, index+1, Combination+d);
        }
        
    }
    public static void main(String args[]){
        String str="55";
        printCombinations(str, 0, "");
    }
}
