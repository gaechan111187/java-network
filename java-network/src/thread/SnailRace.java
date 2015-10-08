package thread;

import java.util.Random;

public class SnailRace {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("달팽이 경주");
		System.out.println("달팽이들 출발 준비...");
		Snail s1 = new Snail("성한");
		Snail s2 = new Snail("순환");
		Snail s3 = new Snail("준규");
		Snail s4 = new Snail("혜숙");
		
//		s1.setPriority(10);
//		s2.setPriority(3);
//		s3.setPriority(2);
//		s4.setPriority(1);
//		for (int i = 5; i > 0; i--) {
//			System.out.println(i+"초");
//			Thread.sleep(1000);
//			}
//			System.out.println("경주 시작!!!!!!+\n");
//			
//		
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
		//달팽이들이 경기를 마치기 전까지는 main() 쓰레드를 종료시키면
		//안되기 때문에 블락(걸어잠근다) 시켜야 하므로
		//join()을 호출한다.
		
		s1.join();
		s2.join();
		s3.join();
		s4.join();
		
		System.out.println("달팽이 경주 종료");
		
	}
}
class Snail extends Thread{
	public Snail(String name){
		super(name);
	}
	public void run(){
		Random r = new Random();
		for (int i = 0; i < 30; i++) {
			int randomNum =r.nextInt(501);
				try {
					sleep(randomNum);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName()+"달팽이"+i+"미터 전진");
		}
		System.out.println(getName()+"달팽이가 결승점을 통과합니다.!!");
	}
}
class RaceGame{
	
}
