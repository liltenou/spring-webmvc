package com.coenterprise.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coenterprise.entity.Consumer;
import com.coenterprise.entity.Parameter;
import com.coenterprise.entity.ParameterValue;
import com.coenterprise.entity.Producer;
import com.coenterprise.entity.Protocol;
import com.coenterprise.proxy.ConsumerProxy;
import com.coenterprise.proxy.TransferForm;
import com.coenterprise.proxy.TransferFormProxy;
import com.coenterprise.service.ConsumerService;
import com.coenterprise.service.ParameterService;
import com.coenterprise.service.ParameterValueService;
import com.coenterprise.service.ProducerService;
import com.coenterprise.service.ProtocolService;

;

@Controller
public class TransferFormController {
	@Autowired
	private  ParameterService parameterService;
	@Autowired
	private ProtocolService protocolService;
	@Autowired
	private ConsumerService consumerService;
	@Autowired
	private ProducerService producerService;
	@Autowired
	private ParameterValueService parameterValueService;

	@RequestMapping(value = "/filetransfer/add")
	public ModelAndView addProducerAndConsumer(
			@ModelAttribute("command") TransferFormProxy transfer) {
		ModelAndView modelAndView = new ModelAndView("filetransfer");
		List<Protocol> listProtocolName = protocolService.getProtocols();
		modelAndView.addObject("listProtocolName", listProtocolName);
		modelAndView.addObject("producerName", new Producer());
		modelAndView.addObject("consumerName", new Consumer());
		modelAndView.addObject("filename", new Producer());

		return modelAndView;
	}

	// add Parameter
	@RequestMapping(value = "/filetransfer/add/process", method = RequestMethod.POST)
	public ModelAndView addingProducerAndConsumer(
			@ModelAttribute("command") TransferFormProxy transfer) {
		Producer producer = producerService.addProducer(transfer);
		consumerService.addConsumer(transfer, producer);

		ModelAndView modelAndView = new ModelAndView(
				"redirect:/filetransfer/list");

		String message = "New delivery method was successfully added.";
		modelAndView.addObject("message", message);
		modelAndView.addObject("protocol", "protocol"); //

		return modelAndView;
	}

	// @RequestMapping(value="/filetransfer/add/parameter/{id}", method =
	// RequestMethod.GET)
	// public ModelAndView addParameterValues (
	// @ModelAttribute ("paramName") TransferFormProxy transfer @PathVariable
	// Integer id {
	//
	// }

	@RequestMapping(value = "/filetransfer/list", method = RequestMethod.GET)
	public ModelAndView listParameters(
			@ModelAttribute("command") TransferFormProxy transfer) {
		ModelAndView modelAndView = new ModelAndView("listroute");
		List<Consumer> listConsumers = consumerService.getConsumers();
		modelAndView.addObject("listConsumers", listConsumers);
		return modelAndView;
	}

	// get file transfer to edit
	@RequestMapping(value = "/filetransfer/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editDeliveryMethod(@ModelAttribute("command") TransferFormProxy transferForm, @PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("editFiletransfer");
		Consumer consumer = consumerService.getConsumer(id);
		Protocol protocol = consumer.getProtocolIdFk();
		Set<Parameter> parameters = protocol.getParameters();

				
		
		transferForm.setId(consumer.getId());
//		transferForm.setProtocolIdFk(consumer.getProtocolIdFk().getId());
		
		
		modelAndView.addObject("consumer", consumer);
		modelAndView.addObject("parameters", parameters);
		modelAndView.addObject("paramValue", new ParameterValue());

		
		return modelAndView;
	}

	// edit filetransfer
	// @RequestMapping(value = "/filetransfer/edit/{id}", method =
	// RequestMethod.POST)
	// public ModelAndView editParameter(@ModelAttribute Parameter filetransfer,
	// @PathVariable Integer id) {
	// ModelAndView modelAndView = new ModelAndView("listroute");
	//
	// parameterService.editParameter(filetransfer);
	// String message = "Parameter was successfully updated.";
	// modelAndView.addObject("message", message);
	//
	// return modelAndView;
	// }

	// delete filetransfer
	@RequestMapping(value = "/filetransfer/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteParameter(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("redirect:listroute");
		parameterService.deleteParameter(id);
		String message = "Delivery method has been deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}