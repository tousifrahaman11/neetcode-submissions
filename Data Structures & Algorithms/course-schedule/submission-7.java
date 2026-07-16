class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      
        int[] ind = new int[numCourses];
        List<List<Integer>> li = new ArrayList<>();
        for(int i = 0; i<numCourses; i++){
            li.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            ind[pre[1]]++;
            li.get(pre[0]).add(pre[1]);
        }
        Queue<Integer> q1 = new LinkedList<>();
        for(int i = 0; i<numCourses; i++){
            if(ind[i] == 0){
                 q1.add(i);
            }
        }
        int fin = 0;
         while(!q1.isEmpty()){
            int node = q1.poll();
            fin++;
            for(int nei : li.get(node)){
                ind[nei]--;
            
            if(ind[nei] == 0){
                q1.add(nei);
            }
            }
         }
             return fin == numCourses;
         
        
    }
}
