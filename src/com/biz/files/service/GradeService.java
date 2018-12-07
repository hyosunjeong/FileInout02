package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.GradeVO;

public class GradeService {
	
	List<GradeVO> gradeList;
	List<String> strNumList;
	
	String strFileName;
	
	// 매개변수 strFileName이 있는 생성자
	public GradeService(String strFileName) {
		this.gradeList = new ArrayList();
		this.strNumList = new ArrayList();
		this.strFileName = strFileName;
		
	}
	
	public void makeNum() {
		int intGradeLen = gradeList.size();
		for(int i = 0; i< intGradeLen; i++) {
			int intNum = i+1;
			
			String strNum = String.valueOf(intNum);	// 정수(숫자)를 문자형으로 바꾸는 방법
			strNumList.add(strNum);
			
			//strNumList.add(""+intNum);
			
		}
		
		// List<String> strNumList에 담긴 학번은
		// 현재는 정렬이 된 상태이나
		// 만약 정렬되지 않고, 중복값이 있다고 하면
		Set<String> setString = new TreeSet(strNumList);
		strNumList = new ArrayList(setString);
			 
	}
	
	
	public void addNum() {
		// 1번째 방법
		int intListLen = gradeList.size();
		for(int i = 0; i < intListLen; i++) {
			GradeVO vo = gradeList.get(i);
			String strNum = strNumList.get(i);
			vo.setStrNum(strFileName);
			
		// 2번째 방법			
			gradeList.get(i).setStrNum(strNumList.get(i));
		}
		
	}
	
	// 성적일람표(아직 점수는 없는) 생성하는 부분
	public void readFile() {
		FileReader  fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null)break;
				
				String[] strNames = reader.split(":");
				
				GradeVO vo = new GradeVO();
				vo.setStrName(strNames[0]);
				gradeList.add(vo);
				
			}
					
			buffer.close();
			fr.close();
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void makeScore() {
		
		for(GradeVO vo : gradeList) {
			int intKor = (int)(Math.random()*(100-50+1))+50;
			int intEng = (int)(Math.random()*(100-50+1))+50;
			int intMath = (int)(Math.random()*(100-50+1))+50;
			int intSum =intKor+intEng+intMath;
			float floatAvg = intSum / 3f;
			
			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMath);
			vo.setIntSum(intSum);
			vo.setFloatAvg(floatAvg);
		}
	}
	
	public void view() {
		
		System.out.println("===========================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------");
		
		for(GradeVO vo : gradeList) {
		
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName()+ "\t");
			System.out.print(vo.getIntKor()+ "\t");
			System.out.print(vo.getIntEng()+ "\t");
			System.out.print(vo.getIntMath()+ "\t");
			System.out.print(vo.getIntSum()+ "\t");
			System.out.print(vo.getFloatAvg()+ "\n");
		}
		
	}

}
