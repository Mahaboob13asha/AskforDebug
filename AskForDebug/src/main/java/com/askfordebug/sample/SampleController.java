package com.askfordebug.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;


@Controller
@RequestMapping("VIEW")
public class SampleController {
	private final static Log _log = LogFactoryUtil.getLog(SampleController.class);
	@RenderMapping
	public String question(Model model) {

		return "sample/view";
	}

}
