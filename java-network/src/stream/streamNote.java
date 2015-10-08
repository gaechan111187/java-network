package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @file_name : streamNote.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 8.
 * @story     : 스트림 문법
 */
public class streamNote {
	/**
	 * 모든 스트림(데이터의 흐름 : 강줄기, 수도물) 2가지 종류가 있다.
	 * 1. 바이트 스트림 (튜브의 지름이 작고, 빠르다)
	 * 2. 문자 스트림 (튜브의 지름이 바이트의 두배 크다. 용량이 크다)
	 * 바이트 스트림은 InputStream => IS 로 끝나고
	 * 기본형타입(primitive) => P타입
	 * 객체형타입(reference) => R타입
	 * DataIS : P타입
	 * ObjectIS(OS) : R타입
	 * BufferdIS(OS) : 바이트를 버퍼에 저장했다가 한꺼번에 입출력
	 * 문자 스트림은 Reader(Writer) => getter, setter 를 클래스화 한 형상
	 */
	public static void main(String[] args) {
		String fileName="C:\\Users\\user\\Desktop\\dddd\\test.txt", buffer ="";
		BufferedWriter bw;
		BufferedReader br;
		try {
			bw = new BufferedWriter(new FileWriter(new File(fileName)));
			bw.write("안녕");
			bw.newLine(); //system.out.prinln();
			bw.write("반갑다 자바야..!");
			bw.newLine();
			bw.write("반갑다 졸리다");
			bw.close(); // 항상 닫 주어야 저장이 됨..카톡에서 문자를 쓰고 엔터를 누르는 것과 동일
			
			br = new BufferedReader(new FileReader(new File(fileName)));
			while ((buffer = br.readLine()) != null) { //읽어 드린 내용 끝까지
				System.out.println(buffer);
			}
			br.close();     //마찬가지로 꼭 닫아야함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
