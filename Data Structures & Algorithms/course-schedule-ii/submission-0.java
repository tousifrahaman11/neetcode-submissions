class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     int[] ind = new int[numCourses];
        List<List<Integer>> li = new ArrayList<>();

        for(int i = 0; i<numCourses; i++){
            li.add(new ArrayList<>());
        }

        for(int[] edg : prerequisites){
            int cou = edg[0];
            int preq = edg[1];
            li.get(preq).add(cou);
            ind[cou]--;
        }
        Queue<Integer> q1 = new LinkedList<>();
        for(int i = 0; i<numCourses; i++){
            if(ind[i] == 0) q1.add(i);
        }
        int[] ord = new int[numCourses];
        int idx = 0;
        while(!q1.isEmpty()){
            int curr = q1.poll();
            ord[idx++] = curr;

            for(int nei : li.get(curr)){
                ind[nei]++;
                if(ind[nei] == 0) q1.add(nei);
            }
        }
        return idx == numCourses ? ord : new int[0];   
    }
}
