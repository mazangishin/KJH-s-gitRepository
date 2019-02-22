
public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// s = "Hello" 와 같이 중복되는 것은 최대한 생략했음
		
		String s = new String ("Hello");
		System.out.println("s = " + s);
		
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s1 = new String (c);
		System.out.println("s1 = " + s1);
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Hello");
		String s2 = new String ("sb = " + sb);
		System.out.println("s2 = " + s2);
		System.out.println();
		
		String n = "0123456";
		char c1 = s.charAt(1);
		char c2 = n.charAt(1);
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println();
		
		String nameStr = "박성욱";
		String lastName = nameStr.charAt(0) + "";
		System.out.println(lastName);
		
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println("i = " + i);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println();
		
		String s4 = "hello";
		String s5 = s4.concat(" world");
		System.out.println("s5 = " + s5);
		System.out.println();
		
		String s6 = "abcdefg";
		boolean b = s6.contains("bc");
		System.out.println("b = " + b);
		System.out.println();
		
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");
		System.out.println("b2 = " + b2);
		System.out.println();
		
		boolean b5 = s.equalsIgnoreCase("Hello");
		boolean b6 = s.equalsIgnoreCase("hello");
		String strObj = new String("Hello");
		String aaa = "Hello";
		System.out.println("b5 = " + b5);
		System.out.println("b6 = " + b6);
		System.out.println("Hello".equals(strObj));
		System.out.println();
		
		int index1 = s.indexOf('o');
		int index2 = s.indexOf('k');
		System.out.println("index1 = " + index1);
		System.out.println("index2 = " + index2);
		System.out.println();
		
		int idx1 = s.indexOf('e', 0);
		int idx2 = s.indexOf('e', 2);
		System.out.println("idx1 = " + idx1);
		System.out.println("idx2 = " + idx2);
		System.out.println();
		
		String s7 = "ABCDEFG";
		int idx = s7.indexOf("CD");
		System.out.println("idx = " + idx);
		System.out.println();
		
		String s8 = new String("abc");
		String s9 = new String("abc");
		boolean b7 = (s8==s9);
		boolean b8 = s8.contentEquals(s9);
		boolean b9 = (s8.intern() == s9.intern());
		System.out.println("b7 = " + b7);
		System.out.println("b8 = " + b8);
		System.out.println("b9 = " + b9);
		System.out.println();
		
		String s10 = "java.lang.Object";
		int idx3 = s10.lastIndexOf('.');
		int idx4 = s10.indexOf('.');
		System.out.println("idx3 = " + idx3);
		System.out.println("idx4 = " + idx4);
		System.out.println();
		
		int idx5 = s10.lastIndexOf("java");
		int idx6 = s10.indexOf("java");
		System.out.println("idx5 = " + idx5);
		System.out.println("idx6 = " + idx6);
		System.out.println();
		
		int length = s.length();
		System.out.println("length = " + length);
		System.out.println();
		
		String s11 = s.replace('H', 'C');
		System.out.println("s11 = " + s11);
		System.out.println();
		
		String s12 = "Hellollo";
		String s13 = s12.replace("ll", "LL");
		System.out.println("s13 = " + s13);
		System.out.println();
		
		String ab2 = "AABBAABB";
		String r = ab2.replaceAll("BB", "bb");
		System.out.println("r = " + r);
		System.out.println();
		
		String r1 = ab2.replaceFirst("BB", "bb");
		System.out.println("r1 = " + r1);
		System.out.println();
		
		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println();
		
		String[] arr1 = animals.split(",", 2);
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr1[1] = " + arr1[1]);
		System.out.println();
		
		boolean b10 = s10.startsWith("java");
		boolean b11 = s10.startsWith("lang");
		System.out.println("b10 = " + b10);
		System.out.println("b11 = " + b11);
		System.out.println();
		
		String c3 = s10.substring(10);
		String p = s10.substring(5, 9);
		System.out.println("c3 = " + c3);
		System.out.println("p = " + p);
		System.out.println();
		
		String s14 = s.toLowerCase();
		System.out.println("s14 = " + s14);
		System.out.println();
		
		String s15 = s.toString();
		System.out.println("s15 = " + s15);
		System.out.println();
		
		String s16 = s.toUpperCase();
		System.out.println("s16 = " + s16);
		System.out.println();
		
		String s17 = "		Hello World		";
		String s18 = s17.trim();
		System.out.println("s18 = " + s18);
		System.out.println();
		
		String b12 = String.valueOf(true);
		String c4 = String.valueOf('a');
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		System.out.println("b12 = " + b12);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("date = " + date);
		System.out.println();
		
	}

}
