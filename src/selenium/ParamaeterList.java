package selenium;

import java.util.ArrayList;
import java.util.List;



public class ParamaeterList {
	
	
	public void empDetails(int empId, String name, String email) {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(email);
	}
	public void test(List<Integer> nums) {
	for (Integer V : nums) {
		System.out.println(V);
	}	
	}
    public void add(int a, int b) {
    	int C = a+b;
    	System.out.println(C);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ParamaeterList Pl = new ParamaeterList();
		               Pl.add(10,20);
		
		List<Integer> l =  new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		
		Pl.test(l);
		Pl.empDetails(15450,"venkateshraj","venkateshraj@gmail.com");
		
		System.out.println("GIT class changes");
	}

}
