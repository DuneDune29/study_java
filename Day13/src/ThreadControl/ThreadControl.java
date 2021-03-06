package ThreadControl;

public class ThreadControl {
	
	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}
	
	private static class MessageLoop implements Runnable{
		public void run() {
			String message[] = { "Pride will have a fall.",
					"Power is dangerous unless you have humility.",
					"Office changes manners.",
					"Empty vesels make the most sound."};
			
			try {
				for (int i = 0; i < message.length; i++) {
					print(message[i]);
					Thread.sleep(2000);
					
				// 인터럽트되면 메시지 출력	
				}
			} catch (InterruptedException e) {
				print("아직 끝나지 않았어요!");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		int tries = 0;
		
		print("추가적이 스레드를 시작합니다.");
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		print("추가적인 스레드가 끝나기를 기다립니다.");
		
		//스레드 t가 종료하기를 1초동안 기다림
		while (t.isAlive()) {
			print("아직 기다립니다.");
			t.join(1000);
			tries++;
			if(tries > 2) {
				print("잡을 수 없네요!");
				
				//스레드 t를 강제로 중단시킴
				t.interrupt();
				t.join();
			}
			
			// 스레드 t가 종료하기를 기다림.
		}
		print("메인 스레드 종료!");
	}
}