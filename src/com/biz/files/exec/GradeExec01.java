package com.biz.files.exec;

import com.biz.files.service.GradeService;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFileName = "src/com/biz/files/service/우리말이름.txt";
		GradeService gs = new GradeService(strFileName);

		// 성적리스트를 생성
		gs.readFile();
		
		// 학번 생성
		gs.makeNum();
		
		// 성적리스트에 학번을 세팅
		gs.addNum();
		
		// 임의로 점수 생성
		gs.makeScore();

		// console에 출력
		gs.view();


	}

}
