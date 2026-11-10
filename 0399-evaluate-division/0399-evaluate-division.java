class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
    Map<String, Map<String, Double>> graph = new HashMap<>();
    for (int i = 0; i < equations.size(); i++) {
    String a = equations.get(i).get(0);
    String b = equations.get(i).get(1);
    double value = values[i];
    graph.putIfAbsent(a, new HashMap<>());
    graph.putIfAbsent(b, new HashMap<>());
    graph.get(a).put(b, value);
    graph.get(b).put(a, 1.0 / value);
        }
    double[] result = new double[queries.size()];
    for (int i = 0; i < queries.size(); i++) {
    String start = queries.get(i).get(0);
    String end = queries.get(i).get(1);
    if (!graph.containsKey(start) ||
    !graph.containsKey(end)) {
    result[i] = -1.0;
    } else {
    Set<String> visited = new HashSet<>();
    result[i] = dfs(start, end, graph, visited);
            }
        }
    return result;
    }
    public double dfs(
    String start,
    String end,
    Map<String, Map<String, Double>> graph,
    Set<String> visited) {
    if (start.equals(end)) {
    return 1.0;
        }
    visited.add(start);
    for (String neighbor : graph.get(start).keySet()) {
    if (!visited.contains(neighbor)) {
    double value = dfs(
    neighbor, end, graph, visited
    );
    if (value != -1.0) {
    return graph.get(start).get(neighbor) * value;
                }
            }
        }
    return -1.0;
    }
}

        
    
