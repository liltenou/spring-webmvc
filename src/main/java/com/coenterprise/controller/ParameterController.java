package com.coenterprise.controller;

import com.coenterprise.entity.Parameter;
import com.coenterprise.entity.Protocol;
import com.coenterprise.service.ParameterService;
import com.coenterprise.service.ProtocolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

//@Controller
//public class ParameterController {
//
//    @Autowired
//    private ParameterService parameterService;
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String showParameterForm(Model model) {
//        model.addAttribute("parameter",new Parameter());
//        return "parameter";
//    }
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public String saveParameter( Model model, Parameter parameter) {
//        Parameter existing = parameterService.findByParameterName(parameter.getName());
//        if (existing != null) {
//            model.addAttribute("status", "exist");
//            return "parameter";
//        }
//        parameter.setCreatedOn(new Date());
//        parameterService.saveParameter(parameter);
//        model.addAttribute("saved", "success");
//        return "parameter";
//    }
//
//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String searchParameter(Model model, Parameter parameter) {
//        List<Parameter> parameters = parameterService.findParameters(parameter.getName(), null);//null added
//        model.addAttribute("parameters", parameters);
//        model.addAttribute("search", true);
//        return "listparameters";
//    }
//
//    @RequestMapping(value = "/parameter/edit/{parameterName}", method = RequestMethod.GET)
//    public String updateParameter(Model model, @PathVariable String parameterName) {
//        Parameter parameter = parameterService.findByParameterName(parameterName);
//        model.addAttribute("parameter", parameter);
//        return "listparameters";
//    }
//
//    @RequestMapping(value = "/parameter/update", method = RequestMethod.POST)
//    public String updateParameter( Model model, Parameter parameter) {
//        parameterService.saveParameter(parameter);
//        model.addAttribute("saved", "success");
//        return "parameter";
//    }
//    @RequestMapping(value = "/parameter/delete/{parameterName}", method = RequestMethod.GET)
//    public String deleteParameter(Model model, @PathVariable String parameterName) {
//        parameterService.deleteParameter(parameterName);
//        model.addAttribute("deleted", "success");
//        model.addAttribute("parameter", new Parameter());
//        return "listparameters";
//    }

//}

@Controller
public class ParameterController {
	@Autowired
	private ParameterService parameterService;
	@Autowired
	private ProtocolService protocolService;

	// add protocol to dropdown
	@RequestMapping(value = "/parameter/add", method=RequestMethod.GET)
	public ModelAndView dropdownProtocolName(@ModelAttribute("command") Parameter parameter) {
		ModelAndView modelAndView = new ModelAndView("parameter");
		List <String> protocolName = protocolService.getName();
		List <Integer> protocolId = protocolService.getId();
		List <Protocol> listProtocolName = protocolService.getProtocols();
		modelAndView.addObject("listProtocolName", listProtocolName);
		modelAndView.addObject("protocolName", protocolName); 
		modelAndView.addObject("name", new Parameter());
		modelAndView.addObject("protocolId", protocolId); //
		return modelAndView;
	}
	

//	// view add Parameter page
//	@RequestMapping(value = "/parameter/add")
//	public ModelAndView addParameterPage() {
//		ModelAndView modelAndView = new ModelAndView("parameter");
//		modelAndView.addObject("name", new Parameter());
//		return modelAndView;
//	}

	// add Parameter
	@RequestMapping(value = "/parameter/add/process", method=RequestMethod.POST)
	public ModelAndView addingParameter(@ModelAttribute("command") Parameter parameter) {

		ModelAndView modelAndView = new ModelAndView("parameter");
		parameterService.addParameter(parameter);
//		protocolService.addProtocol(parameter);
		
		
//		parameter.setProtoccolIdFk(protocolIdFk);

		String message = "Parameter successfully added.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	// list parameters
//	@RequestMapping(value = "/parameter/list", method = RequestMethod.GET)
//	public ModelAndView listParameters() {
//		ModelAndView modelAndView = new ModelAndView("listprotocols");
//		List parameters = parameterService.getParameters();
//		modelAndView.addObject("parameters", parameters);
//		return modelAndView;
//	}
	@RequestMapping(value = "/parameter/list", method = RequestMethod.GET)
	public ModelAndView listParameters() {
		ModelAndView modelAndView = new ModelAndView("listprotocols");
		List <Protocol> listProtocols = protocolService.getProtocols();
		modelAndView.addObject("listProtocols", listProtocols);
		return modelAndView;
	}
	
	
	// get parameter to edit
	@RequestMapping(value = "/parameter/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editParameterPage(@PathVariable Integer id) {
		ModelAndView modeAndView = new ModelAndView("parameter");
		Parameter parameter = parameterService.getParameter(id);
		modeAndView.addObject("parameter", parameter);
		return modeAndView;
	}

	// edit parameter
	@RequestMapping(value = "/parameter/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editParameter(@ModelAttribute Parameter parameter,
			@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("parameter");

		parameterService.editParameter(parameter);
		String message = "Parameter was successfully updated.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	// delete parameter
	@RequestMapping(value = "parameter/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteParameter(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("parameter");
		parameterService.deleteParameter(id);
		String message = "Parameter has been deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}