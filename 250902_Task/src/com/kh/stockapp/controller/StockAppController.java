package com.kh.stockapp.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.kh.stockapp.model.vo.Customer;

public class StockAppController {
	private Map<String, Customer> cusData = new HashMap<>();

	public StockAppController() {
		super();
		loadData();
	}
	
	public Map<String, Customer> getCusData() {
		return cusData;
	}

	public void setCusData(Map<String, Customer> cusData) {
		this.cusData = cusData;
	}
	
	/**
	 * 텍스트 파일에 cusData의 데이터 저장
	 */
	public void saveData() {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customer.txt"))) {

			oos.writeObject(cusData);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * cusData에 텍스트의 데이터를 불러옴
	 */
	public void loadData() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.txt"))){
			
			cusData = (Map<String, Customer>) ois.readObject();
			while (true) {
				System.out.println(ois.readObject());
			}
			
		} catch (EOFException e) {
			//System.out.println("====== 파일 모두 읽어옴! ======");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 계정 생성
	 */
	public void createAccount(String id, String pw) {
		
		cusData.put(id, new Customer(pw));
	}
	
	/**
	 * 계정 정보 수정
	 */
	public void updateAccount(String id, String pw) {
		
		cusData.replace(id, new Customer(pw));
		
	}
	
	public void deleteAccount(String id) {
		cusData.remove(id);
	}
	
	public boolean passwordCheck(String id, String pw) {
		
		return pw.equals(cusData.get(id).getPw());
	}
}
