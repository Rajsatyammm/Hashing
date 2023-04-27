public V get(K key) { // T(n) = O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) { // key exist
                Node node = buckets[bi].get(di);
                return node.value;
            } else { // key doesn't exist
                return null;
            }
        }
