public void put(K key, V value) { // T(n) = O(lambda) O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            // if di = -1 key not exist
            // else key exist and we have to update the value

            if (di != -1) { // update
                Node node = buckets[bi].get(di);
                node.value = value;
            } else { // add new Node
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }
