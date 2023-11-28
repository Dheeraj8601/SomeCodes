import java.util.HashMap;
public class HashMapSameAsProblem2 {
    public static String StartReturn(HashMap<String,String> map){
         for(String key:map.keySet()){
             int i=0;
             for(String value:map.values()){
                if(key == value){
                    break;
                }
                i++;
             }
             if(map.size()==i){
                return key;
                
             }
         }
         return null;
    }
    public static void printItinerary(HashMap<String,String> map,String start){
        System.out.print(start+"->");
         for(int i=0;i<map.size();i++){
         start=map.get(start);
         if(i==map.size()-1){
            break;
         }
         System.out.print(start+"->");
         }
         System.out.println(start);
    }
    public static void main(String args[]){
         HashMap<String,String> map=new HashMap<>();

         map.put("chennai", "bangalore");
         map.put("varanasi","delhi");
         map.put("goa","chennai");
         map.put("delhi","goa");

         System.out.println(map);

         //String start=StartReturn(map);

         printItinerary(map,StartReturn(map));
         
     }
 }

