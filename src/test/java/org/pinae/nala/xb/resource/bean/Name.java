package org.pinae.nala.xb.resource.bean;
public class Name extends org.pinae.nala.xb.NalaObject {
	private Lastname lastname;
	private Firstname firstname;
	private String id;
	public void setLastname(Lastname lastname){
		this.lastname = lastname;
	}
	public Lastname getLastname(){
		return lastname;
	}
	public void setFirstname(Firstname firstname){
		this.firstname = firstname;
	}
	public Firstname getFirstname(){
		return firstname;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	
	public class Firstname extends org.pinae.nala.xb.NalaObject {

	}
	
	public class Lastname extends org.pinae.nala.xb.NalaObject {

	}
}