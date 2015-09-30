package com.uames.controller.front;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uames.controller.BaseController;
import com.uames.util.HttpRequestDeviceUtils;

@Controller
@RequestMapping("/share")
public class ShareController extends BaseController {

	@RequestMapping("/index")
	public ModelAndView getShare(HttpServletRequest request){
		
		ModelAndView respone = new ModelAndView("/share/index");
		/*String action = "/share/index";
		respone.addObject("action",action);*/
		if(HttpRequestDeviceUtils.isMobileDevice(request)){
			return new ModelAndView("/share/mindex");
		}
		
		return respone;
	}
	
	@RequestMapping("/read")
	public ModelAndView getRead(HttpServletRequest request){
		
		ModelAndView respone = new ModelAndView("/share/read");
		
		return respone;
	}
	
}
