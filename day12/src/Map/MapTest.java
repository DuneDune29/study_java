package Map;

import java.util.*;

class Student {
	int number;
	String name;

	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

public class MapTest {
	public static void main(String[] args) {
		st.put("20090001", new Student(20090001, "구준표"));
		st.put("20090002", new Student(20090002, "금잔디"));
		st.put("20090003", new Student(20090003, "윤지후"));

		System.out.println(st); // 모든 항목 출력

		st.remove("20090002"); // 하나의 항목 삭제

		st.put("20090003", new Student(20090003, "소이정")); // 하나의 항목 대치

		System.out.println(st.get("20090003")); // 값을 참조

		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
	}
}