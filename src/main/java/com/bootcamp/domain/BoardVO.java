package com.bootcamp.domain;

import java.util.Date;

public class BoardVO {
	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	
	

	public Integer getBno() {
		return bno;
	}



	public void setBno(Integer bno) {
		this.bno = bno;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getWirter() {
		return writer;
	}



	public void setWirter(String wirter) {
		this.writer = wirter;
	}



	public Date getRegdate() {
		return regdate;
	}



	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}



	public int getViewcnt() {
		return viewcnt;
	}



	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}



	public static void main(String[] args) {
		
	}

}
