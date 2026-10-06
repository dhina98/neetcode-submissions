class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //map and put the count 
        //add into priorityqueue
        // do poll to ignore unwanted low items thank K
        //return the number alone with K frequency 
        //start

       // step 1 count map done
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num: nums){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);          
        }
        System.out.println("countMap"+ countMap);

        //prirotyQueue
        PriorityQueue<int[]> pqueue = new PriorityQueue<>((a, b) -> a[0]-b[0]);
        for(Map.Entry<Integer, Integer> pq: countMap.entrySet()){
            pqueue.offer(new int[]{pq.getValue(),pq.getKey()});
        if(pqueue.size()> k){
            pqueue.poll();
        }
        }

        int[] res = new int[k];
        for(int i =0; i< k; i++){
            res[i] = pqueue.poll()[1];
           
         }   
        return res;
    }
}
