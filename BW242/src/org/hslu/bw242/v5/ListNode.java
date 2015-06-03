package org.hslu.bw242.v5;

public class ListNode {
	
	
	int nodeId;
	Object nodeCargo;
	ListNode clientNode;

	
	public ListNode(Object nodeCargo) {
		super();
		this.nodeId = 0;
		this.nodeCargo = nodeCargo;
		
		
	}
	
	
	public void addNode(Object cargo){
		if(this.clientNode == null){
			this.clientNode = new ListNode(cargo);
			this.clientNode.setNodeId(this.nodeId + 1);
		} else {
			this.clientNode.addNode(cargo);
		}
	}
	
		
	public Object getCargoAtIndex(int index){
		if(this.nodeId == index){
			return this.nodeCargo;
		}else {
			return this.clientNode.getCargoAtIndex(index);
		}
	}


	public int getNodeId() {
		return nodeId;
	}


	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	
	
	

}
