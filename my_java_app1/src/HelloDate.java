import java.util.*;

/** Java要求每个文件只能包含一个公共类，即声明为public，并且这个公共类的名称必须与文件名相同，public‌表示这是一个可有外部方法调用的类 */
public class HelloDate{
    //创建一个类包含一个int域和一个char域，不初始化，将他们的值打印
    int myInt;  
    char myChar;  
  
    public void printValues() {  
        System.out.println("int value: " + myInt);  
        System.out.println("char value: " + myChar);  
    }  

    public static void main(String[] args){   //String[] args用来存储命令行参数
        System.out.println("Hello, it's: ");
        System.out.println(new Date());

        System.getProperties().list(System.out);
        System.out.println(System.getProperty("usr.name"));
        System.out.println(System.getProperty("java.library.path"));
        
        HelloDate myHelloDate = new HelloDate();
        myHelloDate.printValues();
    }
}
