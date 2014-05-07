package com.coenterprise.controller;

import com.coenterprise.entity.Protocol;
import com.coenterprise.service.ProtocolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

//@Controller
//public class ProtocolController {
//
//    @Autowired
//    private ProtocolService protocolService;
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String showProtocolForm(Model model) {
//        model.addAttribute("protocol",new Protocol());
//        return "protocol";
//    }
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public String saveProtocol( Model model, Protocol protocol) {
//        Protocol existing = protocolService.findByProtocolName(protocol.getName());
//        if (existing != null) {
//            model.addAttribute("status", "exist");
//            return "protocol";
//        }
//        protocol.setCreatedOn(new Date());
//        protocolService.saveProtocol(protocol);
//        model.addAttribute("saved", "success");
//        return "protocol";
//    }
//
//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String searchProtocol(Model model, Protocol protocol) {
//        List<Protocol> protocols = protocolService.findProtocols(protocol.getName(), null);//null added
//        model.addAttribute("protocols", protocols);
//        model.addAttribute("search", true);
//        return "listprotocols";
//    }
//
//    @RequestMapping(value = "/protocol/edit/{protocolName}", method = RequestMethod.GET)
//    public String updateProtocol(Model model, @PathVariable String protocolName) {
//        Protocol protocol = protocolService.findByProtocolName(protocolName);
//        model.addAttribute("protocol", protocol);
//        return "listprotocols";
//    }
//
//    @RequestMapping(value = "/protocol/update", method = RequestMethod.POST)
//    public String updateProtocol( Model model, Protocol protocol) {
//        protocolService.saveProtocol(protocol);
//        model.addAttribute("saved", "success");
//        return "protocol";
//    }
//    @RequestMapping(value = "/protocol/delete/{protocolName}", method = RequestMethod.GET)
//    public String deleteProtocol(Model model, @PathVariable String protocolName) {
//        protocolService.deleteProtocol(protocolName);
//        model.addAttribute("deleted", "success");
//        model.addAttribute("protocol", new Protocol());
//        return "listprotocols";
//    }

//}

@Controller
public class ProtocolController {
	@Autowired
	private ProtocolService protocolService;
	
	//view add Protocol page
	@RequestMapping(value="/protocol/add")
		public ModelAndView addProtocolPage(){
			ModelAndView modelAndView = new ModelAndView("protocol");
			modelAndView.addObject("name", new Protocol());
			return modelAndView;
		}
	//add Protocol
	@RequestMapping(value="/protocol/add/process", method=RequestMethod.POST)
		public ModelAndView addingProtocol(@ModelAttribute Protocol protocol) {
		
		ModelAndView modelAndView = new ModelAndView("protocol");
		protocolService.addProtocol(protocol);
		
		String message = "Protocol successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
//	//list protocols
//	@RequestMapping(value="/parameter/add", method=RequestMethod.GET)
//		public ModelAndView listProtocols() {
//		ModelAndView modelAndView = new ModelAndView("parameter");
//		List
//		protocols = protocolService.getProtocols();
//		modelAndView.addObject("protocols", protocols);
//		return modelAndView;
//	}
	//get protocol to edit
	@RequestMapping(value="/protocol/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editProtocolPage(@PathVariable Integer id) {
	ModelAndView modeAndView = new ModelAndView("protocol");
	Protocol protocol = protocolService.getProtocol(id);
	modeAndView.addObject("protocol", protocol);
	return modeAndView;
	}
	
	//edit protocol
	@RequestMapping(value="/protocol/edit/{id}", method=RequestMethod.POST)
	public ModelAndView editProtocol(@ModelAttribute Protocol protocol, @PathVariable Integer id){
	ModelAndView modelAndView = new ModelAndView("protocol");
	
	protocolService.editProtocol(protocol);
	String message = "Protocol was successfully updated.";
	modelAndView.addObject("message", message);
	
	return modelAndView;
	}
	
	//delete protocol
	@RequestMapping(value = "protocol/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteProtocol(@PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("protocol");
	protocolService.deleteProtocol(id);
	String message = "Protocol has been deleted.";
	modelAndView.addObject("message", message);
	return modelAndView;
	}
}