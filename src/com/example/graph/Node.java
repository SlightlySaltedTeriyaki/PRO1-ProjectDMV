package com.example.graph;

public class Node {
    int id;
    int x, y;

    public Node(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return id == node.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}