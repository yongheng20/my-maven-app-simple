package cn.edu.tju.scs.spm.my_app_simple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new App().welcome("Yongheng"));
    }
    
    public String welcome(String name) {
		return "Hello, " + name + "!";
	}
}
