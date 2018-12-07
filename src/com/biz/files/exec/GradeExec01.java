package com.biz.files.exec;

import com.biz.files.service.GradeService;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String readFile = "src/com/biz/files/service/우리말이름.txt";
		
		//GradeService service1 = new GradeService(); // 기본 생성자를 호출하는 초기화
													  // 기본 생성자가 없기 때문에 오류가 발생
		
		//생성자에 파일이름을 전달해 주어야 service객체를 사용할 수 있다.
		GradeService service = new GradeService(readFile);
		
		
		// 성적 리스트를 생성
		service.readFile();	
		
		
		// 학번생성
		service.makeNum();

		// 성적리스트에 학번 세팅
		service.addNum();
		
		
		
		service.makeScore();
		
		service.view();
				
	}

}
