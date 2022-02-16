package pkg.deepCurse.javlaModlu.core.boot;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import pkg.deepCurse.javlaModlu.managers.ClassManager;
import pkg.deepCurse.javlaModlu.managers.ClassManager.InternalReloadable;
import qj.util.ReflectUtil;

public class Boot {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			IOException, InterruptedException {

		ClassManager<String, InternalReloadable<String, String>> manager = new ClassManager<String, InternalReloadable<String, String>>();

		File file = new File(System.getProperty("user.dir") + "/external-src/");
//		System.out.println(System.getProperty("user.dir") + " : " + file.exists() + " : " + file.getPath());

		manager.addFile("three", "test3.TestThree", file);

		ReflectUtil.invoke("owo", manager.getClass("three").getConstructor().newInstance());
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();

		manager.addFile("three", "test3.TestThree", file);

		ReflectUtil.invokeStatic("owo", manager.getClass("three"));

		// manager.getClass("three").getMethod("printMe").invoke(null);

		// ();
		// userClass2.getMethod("printMe").invoke(null);
//		URLClassLoader cl = new URLClassLoader(new URL[] { file.toURI().toURL() }, System.class.getClassLoader());
//
//		Class loadedClass = cl.loadClass("test3.TestThree");
//		loadedClass.getMethod("printMe").invoke(null);
//		loadedClass = null;
//
//		Scanner scan = new Scanner(System.in);
//		scan.nextLine();
//
//		Class dloadedClass = cl.loadClass("test3.TestThree");
//		dloadedClass.getMethod("printMe").invoke(null);

//		manager.add("printer", "test1.PrintingTest");
//
//		System.out.println("Success!\nExecuting. . .");
//
//		Method method = manager.getClass("printer").getDeclaredMethod("print", String.class);// .invoke(null, "VALUE");
//		Method nonStaticMethod = manager.getClass("printer").getDeclaredMethod("printNonStatic", String.class);
//		
//		InternalReloadable<String, String> printerInstance = manager.getClass("printer").getConstructor().newInstance();
//		
//		System.out.println("can-access=" + method.canAccess(null));
//		System.out.println("can-access=" + nonStaticMethod.canAccess(printerInstance));
//		
//		method.invoke(null, "value");
//		nonStaticMethod.invoke(printerInstance, "non static value");
//		
//		System.out.println("Starting live test. . .");
//		
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while (true) {
//					try {
//						manager.getClass("printer").getDeclaredMethod("print", String.class).invoke(null, "1");
//					} catch (Exception e) {
//						e.printStackTrace();
//					} 
//				}
//			}
//		});
//		thread.start();
//		
//		Scanner scan = new Scanner(System.in);
//		String st = scan.nextLine(); // exists just to wait for input
//		scan.close();
//		
//		System.out.println("END");
	}

}
