package com.staticInner;

class Outer {

	static class Inner {

		static void show() {
			System.out.println("welcome");
		}

	}

}

public class StaticInner {

	public static void main(String[] args) {
		Outer.Inner.show();

	}

}
