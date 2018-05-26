package com.entity;

public class BoardDTO {


	int num;
	String author;
	String title;
	String content;
	int readcnt;
	String writeday;
	int repRoot;
	int repStep;
	int repIndent;
	String kid ;
	String email;

	public BoardDTO() {}
	public BoardDTO(int num, String author, String title, String content, String kid, String email,
			int readcnt, String writeday, int repRoot, int repStep,
			int repIndent) {
		this.num = num;
		this.author = author;
		this.title = title;
		this.content = content;
		this.readcnt = readcnt;
		this.writeday = writeday;
		this.repRoot = repRoot;
		this.repStep = repStep;
		this.repIndent = repIndent;
		this.kid= kid;
		this.email= email;
		
	}
	
	
	/**
	 * @return kid
	 */
	public String getKid() {
		return kid;
	}
	/**
	 * @param kid 설정할 kid
	 */
	public void setKid(String kid) {
		this.kid = kid;
	}
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email 설정할 email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	public int getRepRoot() {
		return repRoot;
	}
	public void setRepRoot(int repRoot) {
		this.repRoot = repRoot;
	}
	public int getRepStep() {
		return repStep;
	}
	public void setRepStep(int repStep) {
		this.repStep = repStep;
	}
	public int getRepIndent() {
		return repIndent;
	}
	public void setRepIndent(int repIndent) {
		this.repIndent = repIndent;
	}
	
	
	
}