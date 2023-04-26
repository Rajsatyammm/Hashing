private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }
