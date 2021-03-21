# Project CSS 220 - Advanced Algorithm
## Team topic: Directed Graphs
## Team members: 
 - Ospankhan Arailym 190103123
 - Daudekenkyzy Darish 190103317
 - Nurgul Mazhit 190103148
 - Dilnaz Anarkul 190103089
 - Alisher Mukanov 190103257

## Team name: DANAD :smile:

The goal of our project is to implement and explain the Directed Graphs data structure. A directed graph is graph, i.e., a set of objects (called vertices or nodes) that are connected together, where all the edges are directed from one vertex to another. A directed graph is sometimes called a digraph or a directed network.

The following two are the most commonly used representations of a directed graph. 
1. Adjacency Matrix 
2. Adjacency List 

So, we implemented the directed graph with both representation.
If we explain it in short it will be:

- An adjacency matrix, which is a 2D array where each row and column is a node, and a value at that position of the matrix indicates an edge (or the weight of the edge), and a null value (or 0 is a value, or some other Sentinel/significant value) indicates the absence of an edge

- An adjacency list, which is a 2D array (sort of), where the i-th list is a list of all nodes that are connected to the (adjacent) node i. Since our code is directed weighted, we made the list a list of pairs of node names and edge weights.
