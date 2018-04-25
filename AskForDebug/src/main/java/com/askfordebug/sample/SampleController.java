package com.askfordebug.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller
@RequestMapping("VIEW")
public class SampleController {
	
	@RenderMapping
	public String question(Model model) {

		return "sample/view";
	}

}
