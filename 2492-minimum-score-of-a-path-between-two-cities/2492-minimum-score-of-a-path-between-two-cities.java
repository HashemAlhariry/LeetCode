class Solution {
private int result = Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        Map<Integer,List<List<Integer>>> adjacentCities =new HashMap<>();
        for (int[] road:roads) {
            adjacentCities.computeIfAbsent(road[0],cities->new ArrayList<>()).add(Arrays.asList(road[1],road[2]));
            adjacentCities.computeIfAbsent(road[1],cities->new ArrayList<>()).add(Arrays.asList(road[0],road[2]));
        }
        boolean visitedCities[] =new boolean[n+1];
        helperDFS(1,adjacentCities,visitedCities);
        return result;
    }

    private void helperDFS(int node, Map<Integer, List<List<Integer>>> adjacentCities, boolean[] visitedCities) {
        visitedCities[node]=true;
  
        for (List<Integer> edge:adjacentCities.get(node)){
            result=Math.min(result,edge.get(1));
            if(!visitedCities[edge.get(0)]){
                helperDFS(edge.get(0),adjacentCities,visitedCities);
            }
        }
    }
}