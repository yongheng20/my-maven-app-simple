package cn.edu.tju.scs.spm.my_app_simple;

/**
 *  Hello team members!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new App().welcome("Yongheng"));
        System.out.println(new App().welcome("Li Yuze"));
        System.out.println(new App().welcome("Zheng Yifeng"));
    }
    
    public String welcome(String name) {
		return "Hello, " + name + "!";
	}
}
