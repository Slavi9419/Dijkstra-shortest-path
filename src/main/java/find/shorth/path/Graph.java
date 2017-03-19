package find.shorth.path;

import java.io.FileNotFoundException;

import org.jgrapht.graph.SimpleWeightedGraph;

public class Graph {
	private SimpleWeightedGraph<String, Double> myGrapht;
	public GraphFactory graphFactory;

	public Graph() {

		 graphFactory = new TownsFactory();
		try {
			myGrapht = graphFactory.create();
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	}

	public SimpleWeightedGraph<String, Double> getMyGrapht() {
		return myGrapht;
	}

	public void setMyGrapht(SimpleWeightedGraph<String, Double> myGrapht) {
		this.myGrapht = myGrapht;
	}
}
