package com.example.graph;

import java.util.*;

public class Graph {
    List<Node> nodes = new ArrayList<>();
    List<Edge> edges = new ArrayList<>();

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(Node from, Node to, int weight) {
        edges.add(new Edge(from, to, weight));
    }

    public Map<Node, Integer> dijkstra(Node source) {
        Map<Node, Integer> distances = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (Node node : nodes) {
            distances.put(node, Integer.MAX_VALUE);
        }

        distances.put(source, 0);
        queue.add(source);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (Edge edge : edges) {
                if (edge.from.equals(current)) {
                    int newDist = distances.get(current) + edge.weight;
                    if (newDist < distances.get(edge.to)) {
                        distances.put(edge.to, newDist);
                        queue.add(edge.to);
                    }
                }
            }
        }

        return distances;
    }
}