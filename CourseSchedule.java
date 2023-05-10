class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, ArrayList<Integer>> preMap = new HashMap<>();

        for(int i = 0; i < prerequisites.length; i++){
            if(preMap.containsKey(prerequisites[i][0])){
                preMap.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            else{
                preMap.put(prerequisites[i][0], new ArrayList<>(Arrays.asList(prerequisites[i][1])));
            }
        }

        Set<Integer> visitSet = new HashSet<>();
        for(int i = 0; i < numCourses; i++){
            System.out.println(i + "- not much");
            if(!dfs(i, preMap, visitSet)){
                return false;
            } 
        }
        return true;
    }

    private boolean dfs(int course, Map<Integer, ArrayList<Integer>> preMap, Set<Integer> visitSet){

        if(visitSet.contains(course)){
            return false;
        } 

        if(preMap.get(course) == null || preMap.get(course).isEmpty()){
            return true;
        } 

        visitSet.add(course);
        for (int i = 0; i < preMap.get(course).size(); i++){
            if(!dfs(preMap.get(course).get(i), preMap, visitSet)) return false;
        }
        visitSet.remove(course);
        preMap.put(course, new ArrayList<>());
        return true;
    }
}
