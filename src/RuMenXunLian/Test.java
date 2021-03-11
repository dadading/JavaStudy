package RuMenXunLian;

public class Test {
	public static void main(String[] args){
		System.out.println("The size of short is "+ Short.BYTES +" bytes.");
        System.out.println("The size of int is "+ Integer.BYTES +" bytes.");
        System.out.println("The size of long is "+ Long.BYTES +" bytes.");
        System.out.println("The size of long long is "+ Long.BYTES +" bytes.");
        
        int x = 1234;
        System.out.printf("%#o",x);
        System.out.print(" ");
        System.out.printf("%#x",x);
        System.out.println();
        
        System.out.println("0"+Integer.toOctalString(1234)+" ");
        //不转换大写会报错
        String hex=Integer.toHexString(1234);
        System.out.println("0X"+hex.toUpperCase());
        
        
        int num = Integer.parseInt("ABCDEF", 16);
        System.out.printf("%15d",num);
        
        
        
        
        System.out.println("-----------");        
        String a="Hello world!";
        
        System.out.printf(a); 
        System.out.printf("\n");
        //System.out.println(a.length());
        System.out.printf("%d",a.length());
	}
}
