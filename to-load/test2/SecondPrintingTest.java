package test2;

import pkg.deepCurse.javlaModlu.managers.ClassManager.InternalReloadable;

public class SecondPrintingTest implements InternalReloadable<String, String> {
	
	public static void printer() {
		System.out.println("2");
	}
	
}
