public class Recursion_remove_duplicates {
    public static boolean map[]=new boolean[26];
    public static void removeDuplicates(String str,int idx,String newStr){
        if(str.length() == idx){
            System.out.println("New String will be = '"+newStr+"'");
            return;
        }
        char currentChar = str.charAt(idx);
        System.out.println(map[currentChar-'a']+" "+(currentChar-'a'));
        if(map[currentChar-'a']){
            removeDuplicates(str, idx+1, newStr);
        }
        else{
            newStr += currentChar;
            map[currentChar - 'a']=true;
            removeDuplicates(str, idx+1, newStr);
        }
    }

    public static void main(String  args[]){
        String str="naabcdaabcde";
        removeDuplicates(str,0,"");
        
    }
}
