

import java.util.ArrayList;
import java.util.List;
 
public class Vert implements Comparable<Vert> {
 
	private boolean visited;
	private String name;
	private List<Edge> List;
	private double dist = Double.MAX_VALUE;
	private Vert pr;
	
 
	public Vert(String name) {
		this.name = name;
		this.List = new ArrayList<>();
	}
	
	public List<Edge> getList() {
		return List;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	
 
	public void setList(List<Edge> List) {
		this.List = List;
	}
	
	public void addNeighbour(Edge edge) {
		this.List.add(edge);
	}
	
	public boolean Visited() {
		return visited;
	}
 
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
 
	public Vert getPr() {
		return pr;
	}
 
	public void setPr(Vert pr) {
		this.pr = pr;
	}
 
	public double getDist() {
		return dist;
	}
 
	public void setDist(double dist) {
		this.dist = dist;
	}
 
	@Override
	public String toString() {
		return this.name;
	}
 
	@Override
	public int compareTo(Vert otherV) {
		return Double.compare(this.dist, otherV.getDist());
	}
}