package com.kh.e_object_array.student.view;

import com.kh.e_object_array.student.controller.StudentController;

public class StudentMenu {
	// ====== 필드부
	StudentController ssm = new StudentController();
	
	// ====== 생성자부
	public StudentMenu() {
		
		System.out.println("====== 학생 정보 출력 ======");
		
		ssm.printStudent();
		
		
	}

}
