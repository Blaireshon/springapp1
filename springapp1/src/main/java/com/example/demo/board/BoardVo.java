package com.example.demo.board;

import java.sql.Date;

public class BoardVo {

	private int num;
	private String writer;
	private Date w_date;
	private String title;
	private String content;
	private int parent;//원글 번호
	
	public BoardVo() {
	}

	public BoardVo(int num, String writer, Date w_date, String title, String content) {
		this.num = num;
		this.writer = writer;
		this.w_date = w_date;
		this.title = title;
		this.content = content;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public BoardVo(int num, String writer, Date w_date, String title, String content, int parent) {
		super();
		this.num = num;
		this.writer = writer;
		this.w_date = w_date;
		this.title = title;
		this.content = content;
		this.parent = parent;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getW_date() {
		return w_date;
	}

	public void setW_date(Date w_date) {
		this.w_date = w_date;
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

	@Override
	public String toString() {
		return "boardVo [num=" + num + ", writer=" + writer + ", w_date=" + w_date + ", title=" + title + ", content="
				+ content + "]";
	}
	
	
}
