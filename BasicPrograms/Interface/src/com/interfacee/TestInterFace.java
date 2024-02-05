package com.interfacee;

interface printable {
	int a = 10;

	void showmsg();
}

class print implements printable {
	
	@Override
	public void showmsg() {
		System.out.println("hi");
	}
}

public class TestInterFace {

	public static void main(String[] args) {
		

		print p=new print();
		p.showmsg();
		
		
		printable pp=new print() ;
		pp.showmsg();
	}

}
