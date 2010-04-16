package com.mayletters.mvc.intercept;

import com.mayletters.service.AppManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.ModelAndView;

public class EntityManagerCleanupInterceptor extends HandlerInterceptorAdapter {

	private AppManager appManager;

	public void setAppManager(AppManager appManager) {
		this.appManager = appManager;
	}

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

		appManager.closeCommunication();

	}

}
