package com.coenterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coenterprise.entity.Protocol;
import com.coenterprise.service.ProtocolService;

@Controller
public class ProtocolController {
	@Autowired
	private ProtocolService protocolService;

	// view add Protocol page
	@RequestMapping(value = "/protocol/add")
	public ModelAndView addProtocolPage() {
		ModelAndView modelAndView = new ModelAndView("protocol");
		modelAndView.addObject("name", new Protocol());
		return modelAndView;
	}

	// add Protocol
	@RequestMapping(value = "/protocol/add/process", method = RequestMethod.POST)
	public ModelAndView addingProtocol(@ModelAttribute Protocol protocol) {

		ModelAndView modelAndView = new ModelAndView("protocol");
		protocolService.addProtocol(protocol);

		String message = "Protocol successfully added.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	// //list protocols
	// @RequestMapping(value="/parameter/add", method=RequestMethod.GET)
	// public ModelAndView listProtocols() {
	// ModelAndView modelAndView = new ModelAndView("parameter");
	// List
	// protocols = protocolService.getProtocols();
	// modelAndView.addObject("protocols", protocols);
	// return modelAndView;
	// }
	// get protocol to edit
	@RequestMapping(value = "/protocol/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editProtocolPage(@PathVariable Integer id) {
		ModelAndView modeAndView = new ModelAndView("protocol");
		Protocol protocol = protocolService.getProtocol(id);
		modeAndView.addObject("protocol", protocol);
		return modeAndView;
	}

	// edit protocol
	@RequestMapping(value = "/protocol/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editProtocol(@ModelAttribute Protocol protocol,
			@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("protocol");

		protocolService.editProtocol(protocol);
		String message = "Protocol was successfully updated.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	// delete protocol
	@RequestMapping(value = "protocol/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteProtocol(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("protocol");
		protocolService.deleteProtocol(id);
		String message = "Protocol has been deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}