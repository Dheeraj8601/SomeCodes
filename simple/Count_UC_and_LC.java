public class Count_UC_and_LC {
    public static void main(String args[]){
        String str="aaaAAAbbbCC";
        int uc=functionCountUpper(str);
        int lc=functionCountLower(str);
        /* 
        int uc=0,lc=0;
        for(int i=0;i<str.length();i++){
            int c=str.charAt(i);
            if(c>=97 && c<=122 ){
                lc++;
            }else if(c>=65 && c<= 90){
                uc++;
            }
        }*/
        System.out.println("Uppercase are :"+uc);
        System.out.println("LowerCase are :"+lc);
        //System.out.println(97+25);
    }
    public static int functionCountLower(String str){
        int lc=0;
        for(int i=0;i<str.length();i++){
            int c=str.charAt(i);
            if(c>=97 && c<=122 ){
                lc++;
            }
        }
        return lc;
    }
    public static int functionCountUpper(String str){
        int uc=0;
        for(int i=0;i<str.length();i++){
            int c=str.charAt(i);
            if(c>=65 && c<= 90){
                uc++;
            }
        }
        return uc;
    }
}
