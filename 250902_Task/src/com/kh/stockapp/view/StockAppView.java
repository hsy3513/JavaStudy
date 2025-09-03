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
		boolean loggedIn = false;
		
		while (!loggedIn) {
			System.out.println("**** 로그인 시스템 ****");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
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

				// Map 에 데이터 추가: put(키값, 밸류값)
				sac.getCusData().put(id, new Customer());
				sac.getCusData().get(id).setPw(pw);

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
						loggedIn = true;
					} else {
						System.out.println("비밀번호가 잘못되었습니다.");
					}

				} else {
					// 존재하지 않는 경우
					System.out.println("아이디가 존재하지 않습니다.");
				}

			default:
				break;
			}

		}
		

		mainView();
	}
	
	public void mainView() {
		
	}
}
