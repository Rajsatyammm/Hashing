public V remove(K key) { // T(n) = O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) { // update
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else { // add new Node
                return null;
            }
        }
