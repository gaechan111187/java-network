package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @file_name : MemberRegister.java
 * @author : chanhok61@daum.net
 * @date : 2015. 10. 8.
 * @story : 회원등록 프로그램
 */
public class MemberRegister {
	/**
	 * 신규회원 가입 프로그램입니다. 저장된 외부에 바탕화면에 member라는 폴더에 아이디.txt로 저장해주시고 만약, 기존에 등록된
	 * 회원이라면 이미 등록된 회원입니다 라고 띄워주세요 존재하지 않는다면 해당 아이디.txt파일을 생성합니다. hong.txt 홍길동
	 * 인적사항파일 lee.txt 이순신 인적사항파일 해당회원이 회원가입한 날짜시간 2015-10-08 4:18 오후 까지
	 * 저장시켜주십시오.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====회원 가입=====");
		System.out.println("ID를 입력하세요");
		String id = scanner.next();
		System.out.println("Password를 입력하세요");
		String pass = scanner.next();
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		// 파일이 존재하는지 여부를 체크해서, 없으면 만들고
		// 있으면 스캐너가 입력받은 정보를 txt 파일에 기재한다.
		String fileName = "C:\\Users\\user\\Desktop\\Member\\" + id + ".txt", buffer = "";
		File file = new File(fileName);
		Date today = new Date();
		SimpleDateFormat date;
		date = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		Member member = new Member();
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		BufferedWriter bw;
		BufferedReader br;

		if (file.exists()) {
			System.out.println("이미 존재하는 아이디 입니다.");
		} else {
			try {
				System.out.println("해당정보를 생성하였습니다.");
				bw = new BufferedWriter(new FileWriter(new File(fileName)));
				bw.write("id:" + member.getId());
				bw.newLine();
				bw.write("pass:" + member.getPass());
				bw.newLine();
				bw.write("이름:" + member.getName());
				bw.newLine();
				bw.write("가입날짜 : "+date.format(today));
				bw.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			br = new BufferedReader(new FileReader(new File(fileName)));
			while ((buffer = br.readLine()) != null) {
				System.out.println(buffer);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String pass;
	private String name;

	public String getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setName(String name) {
		this.name = name;
	}

}