/**
 * General object that will represent a union-find data structure.
 * @author muhammad
 *
 */
public interface UnionFindStructure {

	public UFConnectedComponent find(UnionFindNode node);
	
	public void union(UnionFindNode v1, UnionFindNode v2);
}
