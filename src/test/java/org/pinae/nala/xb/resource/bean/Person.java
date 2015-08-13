package org.pinae.nala.xb.resource.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.pinae.nala.xb.xml.CdataObject;

public class Person extends org.pinae.nala.xb.NalaObject {
	private Sex sex;
	private int age;
	private Telephone telephone;
	private Name name;
	private List<Website> website = new ArrayList<Website>();
	private long id;
	private String kwClass;
	private Date birthday;
	private BigDecimal cost;
	private CdataObject other;
	private String pc;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKwClass() {
		return kwClass;
	}
	public void setKwClass(String kwClass) {
		this.kwClass = kwClass;
	}
	public void setSex(Sex sex){
		this.sex = sex;
	}
	public Sex getSex(){
		return sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setTelephone(Telephone telephone){
		this.telephone = telephone;
	}
	public Telephone getTelephone(){
		return telephone;
	}
	public void setName(Name name){
		this.name = name;
	}
	public Name getName(){
		return name;
	}
	public void setWebsite(Website website){
		this.website.add(website);
	}
	public List<Website> getWebsite(){
		return website;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public CdataObject getOther() {
		return other;
	}
	public void setOther(CdataObject other) {
		this.other = other;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}



	public class Sex extends org.pinae.nala.xb.NalaObject {
		private String key;
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
	}
}