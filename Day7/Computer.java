package Day7;

public abstract class Computer { // 추상클래스
	public abstract void display(); // 추상메소드
	public abstract void typing();
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}