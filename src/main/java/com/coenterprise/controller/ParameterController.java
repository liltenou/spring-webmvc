package com.coenterprise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coenterprise.entity.Parameter;
import com.coenterprise.entity.Protocol;
import com.coenterprise.proxy.ParameterProxy;
import com.coenterprise.service.ParameterService;
import com.coenterprise.service.ProtocolService;

@Controller
public class ParameterController {
	@Autowired
	private ParameterService parameterService;
	@Autowired
	private ProtocolService protocolService;

	// add protocol to dropdown
	@RequestMapping(value = "/parameter/add", method = RequestMethod.GET)
	public ModelAndView dropdownProtocolName(
			@ModelAttribute("command") Parameter parameter) {
		ModelAndView modelAndView = new ModelAndView("parameter");
		List<String> protocolName = protocolService.getName();
		List<Integer> protocolId = protocolService.getId();
		List<Protocol> listProtocolName = protocolService.getProtocols();
		modelAndView.addObject("listProtocolName", listProtocolName);
		modelAndView.addObject("protocolName", protocolName);
		modelAndView.addObject("name", new Parameter());
		modelAndView.addObject("protocolId", protocolId); //
		return modelAndView;
	}

	// add Parameter
	@RequestMapping(value = "/parameter/add/process", method = RequestMethod.POST)
	public ModelAndView addingParameter(
			@ModelAttribute("command") ParameterProxy parameter) {

		parameterService.addParameter(parameter);

		ModelAndView modelAndView = new ModelAndView("redirect:/parameter/add");

		String message = "Parameter successfully added.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value = "/parameter/list", method = RequestMethod.GET)
	public ModelAndView listParameters(
			@ModelAttribute("command") ParameterProxy protocolNameProxy,
			@RequestParam(value = "q", required = false) String searchTerm) {
		ModelAndView modelAndView = new ModelAndView("listprotocols");

		List<Protocol> listProtocols;
		if (searchTerm == null || searchTerm.trim() == "") {
			listProtocols = protocolService.getProtocols();
		} else {
			listProtocols = protocolService.findAllProtocolName(searchTerm);
		}

		modelAndView.addObject("listProtocols", listProtocols);
		modelAndView.addObject("searchTerm", searchTerm);
		return modelAndView;
	}

	// get parameter to edit
	@RequestMapping(value = "/parameter/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editParameterPage(
			@ModelAttribute("command") ParameterProxy parameter,
			@PathVariable Integer id) {
		ModelAndView modeAndView = new ModelAndView("editParameter");
		Parameter param = parameterService.getParameter(id);
		parameter.setId(param.getId());
		parameter.setName(param.getName());
		parameter.setProtocolIdFk(param.getProtocolIdFk().getId());
		modeAndView.addObject("parameter", parameter);
		return modeAndView;
	}

	// edit parameter
	@RequestMapping(value = "/parameter/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editParameter(
			@ModelAttribute("command") ParameterProxy proxy,
			@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/parameter/list");

		parameterService.editParameter(proxy);
		String message = "Parameter was successfully updated.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	// delete parameter
	@RequestMapping(value = "/parameter/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteParameter(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/parameter/list");
		parameterService.deleteParameter(id);
		String message = "Parameter has been deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}