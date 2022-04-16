
public class Dijkstra {
public static void main(String[] args) {
		
		Vert vA = new Vert("A");
		Vert vB = new Vert("B");
		Vert vC = new Vert("C");
		Vert vD = new Vert("D");
		Vert vE = new Vert("E");
		
		vA.addNeighbour(new Edge(3,vA,vC));
		vA.addNeighbour(new Edge(5,vA,vB));
		vC.addNeighbour(new Edge(2,vC,vB));
		vC.addNeighbour(new Edge(6,vC,vE));
		vC.addNeighbour(new Edge(5,vC,vD));
		vB.addNeighbour(new Edge(4,vB,vC));
		vB.addNeighbour(new Edge(3,vB,vD));
		vB.addNeighbour(new Edge(4,vB,vE));
		vE.addNeighbour(new Edge(2,vE,vD));
	
		PathFinder shortestPath = new PathFinder();
		shortestPath.ShortestP(vA);
		System.out.println("Minimum distance from A to B: "+vB.getDist());
		System.out.println("Minimum distance from A to C: "+vC.getDist());
		System.out.println("Minimum distance from A to D: "+vD.getDist());
		System.out.println("Minimum distance from A to E: "+vE.getDist());
		System.out.println();
		System.out.println("Shortest Path from A to B: "+shortestPath.getShortestP(vB));
		System.out.println("Shortest Path from A to C: "+shortestPath.getShortestP(vC));
		System.out.println("Shortest Path from A to D: "+shortestPath.getShortestP(vD));
		System.out.println("Shortest Path from A to E: "+shortestPath.getShortestP(vE));
		
		
	}
}
