package com.cts.ms.model;

import com.cts.ms.entity.GroupEntity;

public class GroupModel {
	
	private String groupcode;
	private String groupTitle;
	private String description;
	private int port;
	
	public GroupModel() {

		
}
	public GroupModel(GroupEntity entity,int port) {
		setGroupCode(entity.getGroupCode());
		setGroupTitle(entity.getGroupTitle());
		setdescription(entity.getDescription());
		setport(port);
	}
	
	
}
