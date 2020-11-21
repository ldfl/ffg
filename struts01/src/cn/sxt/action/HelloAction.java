package cn.sxt.action;
/**
 * 这就是struts的控制器
 * struts是开源、免费、轻量级的MVC框架。
 * 轻量级：没有入侵性(必须实现接口或继承方法).
 */
public class HelloAction {
	public String execute(){
		System.out.println("haha");
		return "success";//响应状态
	}
}
