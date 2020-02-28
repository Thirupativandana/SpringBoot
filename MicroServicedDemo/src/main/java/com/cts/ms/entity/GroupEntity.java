package com.cts.ms.entity;


@Entity
@Table(name="Groups")
public class GroupEntity {
	
	@Id
	private String GroupCode;
	private String GropuTitle;
	private String description;
	private int port;
	
	public GroupModel() {
		
	}

}
