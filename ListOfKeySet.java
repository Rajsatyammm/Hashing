public List<K> keySet() {
            List<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node N : ll) {
                    keys.add(N.key);
                }
            }
            return keys;
        }
