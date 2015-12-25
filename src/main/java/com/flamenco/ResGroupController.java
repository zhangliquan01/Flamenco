package com.flamenco;

import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flamenco.service.IResGroupService;

@Controller
@RequestMapping(value="resgroup")
public class ResGroupController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Resource
	private IResGroupService resGroupService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String GetFavoriteList(Locale locale, Model model) {
		return "503";
	}
}