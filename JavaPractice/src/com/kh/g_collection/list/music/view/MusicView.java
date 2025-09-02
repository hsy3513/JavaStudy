package com.kh.g_collection.list.music.view;

import java.util.Scanner;

import com.kh.g_collection.list.music.controller.MusicController;

public class MusicView {
	// 필드부
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// 메소드부
	// 사용자가 직접 메인메뉴를 선택할 수 있음. 종려 전 까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
	public void mainMenu() {

		
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");		// addList() 실행
			System.out.println("2. 첫 위치에 곡 추가");			// addAtZero()
			System.out.println("3. 전체 곡 목록 출력");			// printAll()
			System.out.println("4. 특정 곡 검색");				// searchMusic()
			System.out.println("5. 특정 곡 삭제");				// removeMusic()
			System.out.println("6. 특정 곡 정보 수정");			// setMusic()
			System.out.println("7. 곡명 오름차순 정렬");			// ascTitle()
			System.out.println("8. 가수명 내림차순 정렬");		// descSinger()
			System.out.println("9. 종료");					// "종료" 출력 후 main()으로 돌아감 (메소드 종료)
			System.out.print("메뉴 번호 선택: ");
			
			int menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
	}
	
	// 마지막 위치에 곡을 추가한 후 성공을 출력하는 메소드
	public void addList() {
		
	}
	
	// 첫 위치에 곡을 추가한 후 성공을 출력하는 메소드
	public void addAtZero() {
		
	}
	
	// 전체 곡 목록을 출력하는 메소드
	public void printAll() {
		
	}
	
	// 특정 곡 검색의 결과를 출력하는 메소드
	public void searchMusic() {
		
	}
	
	// 특정 곡 삭제 결과를 출력하는 메소드
	public void removeMusic() {
		
	}
	
	// 특정 곡 정보 수정 결과를 출력하는 메소드
	public void setMusic() {
		
	}
	
	// 곡 명 오름차순 정렬 성공을 출력하는 메소드
	public void ascTitle() {
		
	}
	
	// 가수 명 내림차순 정렬 성공을 출력하는 메소드
	public void descSinger() {
		
	}

}
