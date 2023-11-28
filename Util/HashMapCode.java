// import java.util.*;
// public class HashMapCode {
//     static class HashMap<K,V>{
//         private class Node{
//         K key;
//         V value;
//         public Node(K key,V value){
//             this.key=key;
//             this.value=value;
//         }
//     }

//     private int n;
//     private int N;
//     private LinkedList<Node> buckets[];

//     @SuppressWarnings("unchecked")
//     public HashMap(){
//         this.N=4;
//         this.buckets=new LinkedList[4];
//         for(int i=0;i<4;i++){
//             this.buckets[i]=new LinkedList<>();
//         }

//     }
//     private int hashFunction(K key){
//         int bi=key.hashCode();
//         return Math.abs(bi)%N;
//     }

//     private int searchInLL(K key,int bi){
//         LinkedList<Node> ll=buckets[bi];

//         for(int i=0;i<ll.size();i++){
//             if(ll.get(i).key==key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     private void rehash(){
//         LinkedList<Node> oldBucket[] = buckets;
//         buckets=new LinkedList[N*2];

//         for(int k=0;k<N*2;k++){
//             buckets[k]=new LinkedList<>();
//         }

//         for(int i=0;i<oldBucket.length;i++){
//             LinkedList<Node> ll=oldBucket[i];
//             for(int j=0;j<ll.size();j++){
//                 Node node =ll.get(j);
//                 put(node.key,node.value);
//             }
//         }
//     }

//     public void put(K key,V value){
//         int bi=hashFunction(key);
//         int di=searchInLL(key,bi);
//         if(di==-1){
//             buckets[bi].add(new Node(key,value));
//             n++;
//         }else{
//             Node node=buckets[bi].get(di);
//             node.value=value;
//         }

//         double lamda=(double)n/N;
//         if(lamda>2.0){
//             rehash();
//         }
  
//     }

//     public boolean containsKey(K key){
//         int bi=hashFunction(key);
//         int di=searchInLL(key,bi);
//         if(di==-1){
//             return false;
//         }else{
//           return  true;
//         }
//     }

//     public V get(K key){
//         int bi=hashFunction(key);
//         int di=searchInLL(key,bi);
//         if(di==-1){
//             return null;
//         }else{
//             Node node=buckets[bi].get(di);
//             return node.value;
//         }
//     }

//     public V remove(K key){
//         int bi=hashFunction(key);
//         int di=searchInLL(key,bi);
//         if(di==-1){
//             return null;
//         }else{
//             Node node=buckets[bi].remove(di);
//             return node.value;
//         }
//     }

//     public ArrayList<K> keySet(){
//         ArrayList<K> keys=new ArrayList<>();
//         for(int bi=0;bi<buckets.length;bi++){
//             LinkedList<Node> ll=buckets[bi];
//             for(int di=0;di<ll.size();di++){
//                 Node node=ll.get(di);
//                 keys.add(node.key);
//             }
//         }
//         return keys;
//     }

//     public boolean isEmpty(){
//         return n==0;
//     }

//     }

//     public static void main(String args[]){
//         HashMap<String,Integer> map=new HashMap<>();
//         map.put("india", 190);
//         map.put("china",200);
//         map.put("US",50);
//         map.put("candy",2);

//         ArrayList<String> keys=map.keySet();
//         for(int i=0;i<keys.size();i++){
//             System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
//         }
//         // while(!map.isEmpty()){

//         // }
//     }
// }

import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            N = N * 2;
            buckets = new LinkedList[N];

            for (int k = 0; k < N; k++) {
                buckets[k] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lamda = (double) n / N;
            if (lamda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int bi = 0; bi < N; bi++) {
                LinkedList<Node> ll = buckets[bi];
                for (int di = 0; di < ll.size(); di++) {
                    Node node = ll.get(di);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 190);
        map.put("china", 200);
        map.put("US", 50);
        map.put("candy", 2);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
    }
}

