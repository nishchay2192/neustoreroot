package neustore.bplustree;

import java.io.IOException;

import neustore.base.DBPage;
import neustore.heapfile.HeapFile;
/**
 * A memory-version Index page of a BPlus Tree indexed File.
 * 2-3 BPlusTree
 * @see BPlusTreeIndex
 * @author Nishchay Kala &lt;nishchay@iitj.ac.in;
 */
public class BPlusTreeIndexPage extends DBPage{
	/**
	 * size for the reserved space.
	 * The first 20 bytes of the disk-version of the BPlusTreeIndexPage are reserved for:
	 * nodeType=1, prev, next, availableBytes, numRecs.
	 */
	protected final int RESERVED = 20;
	
	public BPlusTreeIndexPage(int _nodeType, int _pageSize) {
		super(_nodeType, _pageSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void read(byte[] page) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void write(byte[] page) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
