/**
 * General object
 * @author muhammad
 *
 */
public interface UnionFindStructure {

	public UFConnectedComponent find(UnionFindNode node);
	
	public void union(UnionFindNode v1, UnionFindNode v2);
}
