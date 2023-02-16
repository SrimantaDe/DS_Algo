package javaGraphDs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Bfs {
	
	boolean va[]=new boolean[6];

	
	public static void main(String[] args) {
				
			int n=5;
			
			ArrayList<ArrayList<Integer>> adjlist= new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n+1;i++) 
			{
				adjlist.add(new ArrayList<Integer>());
			}
			
			adjlist.get(1).add(2);
			adjlist.get(2).add(1);
			
			adjlist.get(1).add(5);
			adjlist.get(5).add(1);
			
			adjlist.get(2).add(3);
			adjlist.get(3).add(2);
			
			adjlist.get(3).add(4);
			adjlist.get(4).add(3);
			
			adjlist.get(4).add(5);
			adjlist.get(5).add(4);


			/* the adjacency list adjlist is the graph*/
			
			// BFS algorithm
			 int v=adjlist.size();
			 LinkedList<Integer> queue= new  LinkedList<Integer>();
			 boolean visited[] = new boolean[v];
			 int startingNode=1;
			 visited[startingNode]=true;
			 queue.add(startingNode);
			 
			 while(queue.size()!=0)
			 {
				 int s=queue.poll();
				 System.out.println(s);
				 Iterator<Integer> it= adjlist.get(s).iterator();
				 while(it.hasNext())
				 {
					 int m=it.next();
					 if(!visited[m])
					 {
						 visited[m]=true;
						 queue.add(m);
					 }
					 
				 }
				 
			 } 
				
				 
								 
	}
	
}
