package com.kh.f_poly.controller;

import com.kh.f_poly.model.vo.AniBook;
import com.kh.f_poly.model.vo.Book;
import com.kh.f_poly.model.vo.CookBook;
import com.kh.f_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
		
	
	public LibraryController() {
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] findBook = new Book[5];
		int cnt = 0;
		
		for (Book book : bList) {
			boolean includeTitle = book.getTitle().contains(keyword);
			if (includeTitle) {
				findBook[cnt] = book;
				cnt++;
			}			
		}
		
		return findBook;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if (bList[index] instanceof AniBook) {
			if (mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
				result = 1;
			}
			
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook)bList[index]).getCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
				
		return result;
	}

}
