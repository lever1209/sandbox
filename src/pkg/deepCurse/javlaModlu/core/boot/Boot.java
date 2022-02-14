package pkg.deepCurse.javlaModlu.core.boot;

import pkg.deepCurse.javlaModlu.managers.ClassManager;
import pkg.deepCurse.javlaModlu.managers.ClassManager.InternalReloadable;

public class Boot {

	public static void main(String[] args) {

		ClassManager<String, InternalReloadable> manager = new ClassManager<String, InternalReloadable>();

//		manager.add("");

		System.out.println();

	}

}
