# Graph Implementation

## Overview
This project provides a simple implementation of an **Undirected Graph** in Java using an **Adjacency List**. It allows users to create a graph, add vertices, add edges, and display the structure of the graph.

## Features

- Add vertices to the graph
- Add edges between vertices (undirected)
- Display the graph structure

## Implementation

The core implementation uses a **HashMap** to store the adjacency list, where each key represents a vertex, and its corresponding value is a list of adjacent vertices. The graph supports adding new vertices and edges dynamically.

### Core of the Code

```java
package repo.graph;

import java.util.*;

public class graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void display() {
        for (var entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

## Usage

### 1. Creating a Graph

```java
graph myGraph = new graph();
```

### 2. Adding Vertices

```java
myGraph.addVertex(1);
myGraph.addVertex(2);
```

### 3. Adding Edges

```java
myGraph.addEdge(1, 2);
myGraph.addEdge(2, 3);
```

### 4. Displaying the Graph

```java
myGraph.display();
```

## Example Output

```
Graph representation:
1 -> [2, 3]
2 -> [1, 3]
3 -> [2, 1]
```

## Notes

- The graph is **undirected**, meaning edges are bidirectional.
- The adjacency list is stored using a **HashMap**.
- Vertices and edges must be added before display.

## License

This project is open-source and free to use.



