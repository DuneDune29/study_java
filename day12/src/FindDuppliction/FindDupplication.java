package FindDuppliction;

import java.util.*;


public class FindDupplication {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		String[] sample = { "�ܾ�", "�ߺ�", "����", "�ߺ�" };
		for (String a : sample)
			if (!s.add(a))
				System.out.println("�ߺ��� �ܾ� : " + a);

		System.out.println(s.size() + " �ߺ����� ���� �ܾ�: " + s);
	}
}