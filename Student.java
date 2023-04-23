package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int sid;
	 private String sname;
	 private String semail;
	 private String sphonenumber;
	 private String scity;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	 public String getScity() {
			return scity;
		}
		public void setScity(String scity) {
			this.scity = scity;
		}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSphonenumber() {
		return sphonenumber;
	}
	public void setSphonenumber(String sphonenumber) {
		this.sphonenumber = sphonenumber;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sphonenumber=" + sphonenumber
				+ ", scity=" + scity + "]";
	}
}
	 

