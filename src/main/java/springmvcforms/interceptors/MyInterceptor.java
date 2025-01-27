package springmvcforms.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements  HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		System.out.println("This is preHandle Method");
		String name = request.getParameter("user");
		if(name.startsWith("K")) {
			response.setContentType("text/html");
			response.getWriter().println("Invalid Name.. Name should starts with Letter K");
			return false;
		}
		return true;
	}
	
	/*@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) throws Exception{
		System.out.println("This is postHandle Method");
		super.postHandle(request,response,handler,modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception{
		System.out.println("This is postHandle Method");
		super.afterCompletion(request,response,handler,ex);
	}*/

}
