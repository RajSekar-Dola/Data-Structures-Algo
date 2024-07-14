public class Pair{
        int index;
        int value;
        Pair(int index,int value){
            this.index = index;
            this.value = value;
        }
        int getIndex(){
            return this.index;
        }
        int getValue(){
            return this.value;
        }
    }
     ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        //gfg link:https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.value-a.value);
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(i, arr[i]));
        }
        res.add(pq.peek().getValue());

        for (int i = k; i < n; i++) {
            pq.add(new Pair(i, arr[i]));
            
            while (pq.peek().getIndex() <= i - k) {
                pq.poll();
            }

            res.add(pq.peek().getValue());
        }

        return res;
    }
