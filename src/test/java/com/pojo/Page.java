package com.pojo;

import java.util.ArrayList;

public class Page {
	
	    private int page;
	    private int per_page;
	    private int total;
	    private int total_pages;
	    private ArrayList<Details> data;
	    private Support support;
	    
	    public ArrayList<Details> getData() {
			return data;
		}
		public void setData(ArrayList<Details> data) {
			this.data = data;
		}
		
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public int getPer_page() {
			return per_page;
		}
		public void setPer_page(int per_page) {
			this.per_page = per_page;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public int getTotal_pages() {
			return total_pages;
		}
		public void setTotal_pages(int total_pages) {
			this.total_pages = total_pages;
		}
		
		public Support getSupport() {
			return support;
		}
		public void setSupport(Support support) {
			this.support = support;
		}
}