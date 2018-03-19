package test;

import java.io.ObjectInputStream.GetField;

public class SingtonClass {
	/*private static SingtonClass instance=new SingtonClass();
	private SingtonClass(){}
	private static SingtonClass getSingtonClass(){
		return instance;
	}
	饿汉单利模式
	*/
	
	private static class StaticSingtonClass{
		private static SingtonClass in=new SingtonClass();
	}
	private SingtonClass(){}
	private static  SingtonClass getSington(){
		return StaticSingtonClass.in;
	}
}
