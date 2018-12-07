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

	public GradeService(String strFileName) {
		gradeList = new ArrayList();
		this.strNumList = new ArrayList();
		this.strFileName = strFileName;
	}

	public void readFile() {

		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);

			while (true) {
				String strRead = buffer.readLine();
				if (strRead == null)
					break;
				String[] strSp = strRead.split(":");

				GradeVO vo = new GradeVO();

				vo.setStrName(strSp[0]);
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

	public void makeNum() {
		int intSize = gradeList.size();
		for (int i = 0; i < intSize; i++) {
			int intNum = i + 1;
			String strNum = String.valueOf(intNum);

			strNumList.add(strNum);
		}

		// List<String> strNumList 에 담긴 학번은 현재는 정렬된 상태
		// 만약 정렬되지 않고 중복값이 있다고 하면
//		Set<String> setString = new TreeSet(strNumList);
//		strNumList = new ArrayList(setString);
	}

	public void addNum() {

		int intSize = gradeList.size();
		for (int i = 0; i < intSize; i++) {
			GradeVO vo = gradeList.get(i);
			String strGetN = strNumList.get(i);
			vo.setStrNum(strGetN);
			gradeList.add(vo);

		}
	}

	public void view() {

		int intSize = gradeList.size();
		System.out.println("=======================================================================");
		System.out.println("학번\t이름\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------------------------");

		for (GradeVO vo : gradeList) {
			System.out.print(vo.getStrNum() + "\t");

			if (vo.getStrName().length() >= 4) {
				System.out.print(vo.getStrName() + "\t");
			} else {
				System.out.print(vo.getStrName() + "\t\t");
			}

			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\t");
			System.out.print(vo.getIntSum() + "\t");
			System.out.printf("%.2f\n",vo.getFloatAvg());

		}
	}

	public void makeScore() {
		int intCount = gradeList.size();
		for (int i = 0; i < intCount; i++) {

			GradeVO vo = gradeList.get(i);

			int intKor = (int) (Math.random() * (100 - 50 + 1)) + 1;
			int intEng = (int) (Math.random() * (100 - 50 + 1)) + 1;
			int intMath = (int) (Math.random() * (100 - 50 + 1)) + 1;

			int intSum = intKor;
			intSum += intEng;
			intSum += intMath;

			float floatAvg = intSum / 3.0f;

			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMath);
			vo.setIntSum(intSum);
			vo.setFloatAvg(floatAvg);

			gradeList.add(vo);

		}
	}
}
