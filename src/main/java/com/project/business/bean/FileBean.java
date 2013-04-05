package com.project.business.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "File")
public class FileBean {
	
	private String name;
	private Long size;
	private String type;	
	private String pathLocation;
	
	public String getPathLocation() {
		return pathLocation;
	}
	public void setPathLocation(String pathLocation) {
		this.pathLocation = pathLocation;
	}	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}	
}
