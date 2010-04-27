/**
 * 
 */
package com.mayletters.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author aykutt
 *
 */
public class ExampleController extends ParameterizableViewController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String who = ServletRequestUtils.getStringParameter(request, "who");
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("who", (who == null ? "NULL" : who));
	    mav.setViewName(getViewName());
	    return mav;
	}

}
