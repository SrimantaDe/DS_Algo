package javaGraphDs;

import java.util.ArrayList;

//This determines the number of components of a graph
public class Province {

	
	public static void main(String[] args) {
		int n=5;
		
		ArrayList<ArrayList<Integer>> adjlist= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n+1;i++) 
		{
			adjlist.add(new ArrayList<Integer>());
		}
		
//		adjlist.get(1).add(2);
//		adjlist.get(2).add(1);
		
		adjlist.get(1).add(5);
		adjlist.get(5).add(1);
		
		adjlist.get(2).add(3);
		adjlist.get(3).add(2);
		
		adjlist.get(3).add(4);
		adjlist.get(4).add(3);
		
//		adjlist.get(4).add(5);
//		adjlist.get(5).add(4);
		
		 Dfs obj=new Dfs();
		 int count=0;	 
		 for(int i=1;i<6;i++)
		 {
			 
			 if(!obj.va[i])
			 {
				count++;
				obj.dfs(adjlist,i);
			 }
		 }
		 
		 System.out.println(count);
	}
}
