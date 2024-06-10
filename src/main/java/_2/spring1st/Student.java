package _2.spring1st;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	B b;
	@GetMapping("firstapi")

	public String m1() {
		return "Anup";
	}

	@GetMapping("Secondapi")
	ArrayList<String> m2() {
		ArrayList<String> al = new ArrayList<>();

		al.add("anup");
		al.add("kiran");
		al.add("sagar");
		return al;
	}

		@GetMapping("third")
		String m4() {
			b = new B();
			return b.m2();
		
		}
		

	@PostMapping("insertapi")
	public String insertvalue(String a) {
		System.out.println(a);
		
		
		
		return a;
	
	}
}
