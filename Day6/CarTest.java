package Day6;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("S600", "white", 80); // ù��° ������ ȣ��
		Car c2 = new Car("E500", "blue", 20); // �ι�° ������ ȣ��
		int n = Car.getNumberOfCars(); // ���� �޼ҵ� ȣ��
		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);
	}
}