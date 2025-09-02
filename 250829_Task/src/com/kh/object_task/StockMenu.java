package com.kh.object_task;

import java.util.Scanner;

import com.kh.object_task.controller.StockController;

public class StockMenu {
	private StockController stc = new StockController();
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
	
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 전체 주가 조회");
			System.out.println("2. 시가 총액 조회");
			System.out.println("3. 원화 주가 조회");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("메뉴 번호: ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				stc.viewAll();
				break;

			case 2:
				System.out.println("시가총액을 조회 할 주식 번호를 고르세요");
				stc.viewAll();
				System.out.print("번호: ");
				int index = sc.nextInt();
				stc.viewMarketCap(index);
				break;

			case 3:
				System.out.println("원화주가를 조회 할 주식 번호를 고르세요");
				stc.viewAll();
				System.out.print("번호: ");
				int index1 = sc.nextInt();
				stc.viewRateToWon(index1);
				break;

			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못입력하였습니다. 다시입력해주세요.");
				break;
			}
		}
		
	}
	
	
}
