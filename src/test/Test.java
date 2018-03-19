package test;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test  implements Comparable<Integer>{
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
	System.out.println("aa");
		String a=reverse("abc");
		System.out.println(a);
		System.out.println();
		 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
	        Date d= new Date();
	        String str = sdf.format(d);
	        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);
	        Test ts=(Test) Class.forName("Test").getConstructor().newInstance();
	        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
	        Date d1= new Date();
	        String str1 = sdf1.format(d1);
	        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);

}
public void lambda(int a){
	System.out.println(a);
}

public static String reverse(String originStr) {
    if(originStr == null || originStr.length() <= 1) 
        return originStr;
    return reverse(originStr.substring(1)) + originStr.charAt(0);
}


@Override
public int compareTo(Integer o) {
	// TODO Auto-generated method stub
	return 0;
}
}
