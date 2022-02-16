package test1;

import pkg.deepCurse.javlaModlu.managers.ClassManager.InternalReloadable;

public class PrintingTest implements InternalReloadable<String, String> {

	public static void print(String value) {
		System.out.println(value);
	}

	public  void printNonStatic(String value) {
		System.out.println(value);
	}

}
