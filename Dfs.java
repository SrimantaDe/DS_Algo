package javaGraphDs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Dfs {
	
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


				 
				 Dfs obj=new Dfs();
				 obj.dfs(adjlist,1);
				 
								 
	}
	
	 public void dfs(ArrayList<ArrayList<Integer>> adjlist,int starting) {
		 
		 va[starting]=true;
		 ArrayList<ArrayList<Integer>> adjlist1=adjlist;
	    // System.out.println(starting);
		 Iterator<Integer> it=adjlist1.get(starting).iterator();
		 while(it.hasNext())
		 {
			 int m=it.next();
			 if(!va[m])
			 {
				 dfs(adjlist1,m) ;
			 }
		 }
		 
		 
		 
	 }
}
