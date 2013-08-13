/**
 * Any class that implements this interface can be inserted into a union-find data structure.
 * @author muhammad
 *
 */
public interface UnionFindNode {

	/**
	 * Each node must return a unique (integer) identifier with respect to the UF structure.
	 * @return a unique ID
	 */
	public int getUFID();
}
