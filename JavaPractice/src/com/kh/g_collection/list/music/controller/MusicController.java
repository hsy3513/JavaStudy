package com.kh.g_collection.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.g_collection.list.music.model.vo.Music;

public class MusicController {
	// 필드부
	ArrayList<Music> list = new ArrayList<>();
	
	
	// 메소드부
	// 리스트 마지막에 값을 저장 메소드
	public int addList(Music music) {	
		list.add(music);
		return 1;
	}
	
	// 리스트 첫번쨰에 값을 저장 메소드
	public int addAtZero(Music music) {
		return 1;
	}
	
	// 모든 리스트를 반환하는 메소드
	public List<Music> printAll() {
		return list;
	}
	
	// 곡 명을 검색하는 메소드
	public Music searchMusic(String title) {
		return 1;
	}
	
	// 곡 명으로 찾아 삭제하는 메소드
	public Music removeMusic(String title) {
		return 1;
	}
	
	// 곡 명으로 찾아 내용을 수정하는 메소드
	public Music setMusic(String title, Music music) {
		return ;
	}
	
	// 곡 명 오름차순 정렬하는 메소드
	public int ascTitle() {
		return 1;
	}
	
	// 가수 명을 내림차순 정렬하는 메소드
	public int descSinger() {
		return 1;
	}
	
}
