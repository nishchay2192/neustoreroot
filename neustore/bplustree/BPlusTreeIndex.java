package neustore.bplustree;

import java.io.IOException;

import neustore.base.DBBuffer;
import neustore.base.DBIndex;

public class BPlusTreeIndex extends DBIndex{
	
	public BPlusTreeIndex(DBBuffer buffer, String filename, boolean isCreate)
			throws IOException {
		super(buffer, filename, isCreate);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void readIndexHead(byte[] indexHead) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void writeIndexHead(byte[] indexHead) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initIndexHead() {
		// TODO Auto-generated method stub
		
	}

}
