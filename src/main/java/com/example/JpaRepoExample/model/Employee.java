package com.example.JpaRepoExample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.JpaRepoExample.util.DateFormate;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;



@Table(name="emp")
@javax.persistence.Entity
public class Employee {
	
	@Column(name="EMPNO")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empno;
	@Column(name="ENAME")
	private String empname;
	@Column(name="JOB")
	private String job;
	@Column(name="MGR")
	private Integer mgr;
	@Column(name="HIREDATE")
	@JsonDeserialize(using=DateFormate.class)
	private Date hireDate;
	@Column(name="SAL")
	private int sal;
	@Column(name="COMM")
	private Integer comm;
	@Column(name="DEPTNO")
	private int deptno;
	

	
	public Employee() {
		super();
	}

	public Employee(String empname, String job, int mgr, Date hireDate, int sal, int comm, int deptno) {
		super();
		this.empname = empname;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	public Long getEmpno() {
		return empno;
	}
	public void setEmpno(Long empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		if(mgr==null)
			this.mgr=0;
		this.mgr = mgr;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(Integer comm) {
		if(comm==null)
			this.comm=0;
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", job=" + job + ", mgr=" + mgr + ", hireDate="
				+ hireDate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
}
