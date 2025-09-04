package com.kh.stockapp.view;

import java.util.Scanner;

import com.kh.stockapp.controller.StockAppController;
import com.kh.stockapp.model.vo.Customer;

public class StockAppView {
	private Scanner sc = new Scanner(System.in);
	private StockAppController sac = new StockAppController();
	
	/**
	 * 시작 화면을 보여주는 메소드
	 */
	public void startView() {
		boolean menuTrigger = false;
		
		while (!menuTrigger) {
			System.out.println("**** 로그인 시스템 ****");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 비밀번호 변경");
			System.out.println("4. 회원 탈퇴");
			System.out.println("9. 전체 회원 정보");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택: ");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				// 회원 가입 => 아이디, 비밀번호를 입력받아서, Map 에 추가
				System.out.print("아이디를 입력하세요: ");
				String id = sc.nextLine();

				System.out.print("비밀번호를 입력하세요: ");
				String pw = sc.nextLine();

				if (sac.getCusData().containsKey(id)) {
					System.out.println("이미 있는 아이디 입니다");
					break;
				}

				// 계정 생성(id: 키값, pw: 밸류값 클래스의 필드 변수)
				sac.createAccount(id, pw);
				sac.saveData();

				System.out.println("회원 가입에 성공하였습니다 ^오^");

				break;

			case 2:
				System.out.print("아이디 입력: ");
				String id2 = sc.nextLine();

				if (sac.getCusData().containsKey(id2)) {
					// Map 에 입력 된 아이디가 키값에 존재하는 경우
					System.out.print("비밀번호 입력: ");
					String pw2 = sc.nextLine();

					// Map에서 아이디(키값)에 해당하는 비밀번호(밸류값)를 조회
					// get(키값):밸류값
					if (pw2.equals(sac.getCusData().get(id2).getPw())) {
						// 입력 된 비밀번호와 저장되어 있는 비밀번호가 일치하는 경우
						System.out.println("로그인 성공!");
						//loggedIn = true;
					} else {
						System.out.println("비밀번호가 잘못되었습니다.");
					}

				} else {
					// 존재하지 않는 경우
					System.out.println("아이디가 존재하지 않습니다.");
				}
				
				break;

			case 3:
				System.out.print("아이디 입력: ");
				String id3 = sc.nextLine();

				if (sac.getCusData().containsKey(id3)) {
					// Map 에 입력 된 아이디가 키값에 존재하는 경우
					System.out.print("비밀번호 입력: ");
					String pw3 = sc.nextLine();

					// Map에서 아이디(키값)에 해당하는 비밀번호(밸류값)를 조회
					// get(키값):밸류값
					if (sac.passwordCheck(id3, pw3)) {
						// 입력 된 비밀번호와 저장되어 있는 비밀번호가 일치하는 경우
						System.out.println("본인확인 완료!");
						System.out.print("변경할 비밀번호 입력: ");
						String newPw = sc.nextLine();
						sac.updateAccount(id3, newPw);
						sac.saveData();
						System.out.println("비밀번호 변경 완료!");
					} else {
						System.out.println("비밀번호가 잘못되었습니다.");
					}

				} else {
					// 존재하지 않는 경우
					System.out.println("아이디가 존재하지 않습니다.");
				}
				
				break;
			case 4:
				System.out.print("아이디 입력: ");
				String id4 = sc.nextLine();

				if (sac.getCusData().containsKey(id4)) {
					// Map 에 입력 된 아이디가 키값에 존재하는 경우
					System.out.print("비밀번호 입력: ");
					String pw4 = sc.nextLine();

					// Map에서 아이디(키값)에 해당하는 비밀번호(밸류값)를 조회
					// get(키값):밸류값
					if (sac.passwordCheck(id4, pw4)) {
						// 입력 된 비밀번호와 저장되어 있는 비밀번호가 일치하는 경우
						sac.deleteAccount(id4);
						sac.saveData();
						System.out.println("계정 삭제 완료!");
						
					} else {
						System.out.println("비밀번호가 잘못되었습니다.");
					}

				} else {
					// 존재하지 않는 경우
					System.out.println("아이디가 존재하지 않습니다.");
				}
				
				break;
				
			case 9:
				System.out.println("전체 회원");
				System.out.println(sac.getCusData().entrySet());
				break;
				
			case 0:
				System.out.println("종료합니다");
				return;

			default:
				break;
			}

		}
		

		mainView();
	}
	
	public void mainView() {
		
	}
}
