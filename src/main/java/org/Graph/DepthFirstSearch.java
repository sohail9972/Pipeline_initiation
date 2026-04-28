package org.Graph;

import java.util.*;
import java.util.List;

public class DepthFirstSearch {

    static Map<Object, List<Integer>> graph = new HashMap<>();
    static boolean[] visited = new boolean[5];

    public static void dfs(int node){
        if (visited[node]){
            return;
        }
        visited[node]=true;
        System.out.println(node);

        for (int neighbour : graph.get(node)){
            dfs(neighbour);
        }
    }



    public static void main(String[] args) {
        graph.put(0, Arrays.asList(1,2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList());
        graph.put(3, Arrays.asList());

        dfs(0);
    }
}
