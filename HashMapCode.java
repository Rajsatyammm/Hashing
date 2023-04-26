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

        private int n; // no of nodes in bucket
        private int N;
        
        private LinkedList<Node> buckets[];

        @SuppressWarnings("uncheaked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
      
      public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("US", 80);

        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Pak"));

        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
        // System.out.println(hm);
        List<String> key = new ArrayList<>();
        key = hm.keySet();
        System.out.println(key);
    }
}
