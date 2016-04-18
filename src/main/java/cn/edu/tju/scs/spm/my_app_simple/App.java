package cn.edu.tju.scs.spm.my_app_simple;

/**
 *  Hello team members!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new App().welcome("Jia Yongheng"));
        System.out.println(new App().welcome("Li Yuze"));
        System.out.println(new App().welcome("Zheng Yifeng"));
        System.out.println(new App().welcome("Wang Jingwen"));        
        System.out.println(new App().welcome("Zhao Junting"));
    }
    
    public String welcome(String name) {
		return "Hello, " + name + "!";
	}
}
