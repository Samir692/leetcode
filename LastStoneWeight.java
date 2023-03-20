class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {

        if(stones.length == 1){
            return stones[0];
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones)
            maxHeap.add(stone);

        while(maxHeap.size() > 1){
            Integer first = maxHeap.poll();
            Integer second = maxHeap.poll();

            if(second < first){
                maxHeap.add(first-second);
            }

        }

        maxHeap.add(0);
        return maxHeap.poll();
    }
}
