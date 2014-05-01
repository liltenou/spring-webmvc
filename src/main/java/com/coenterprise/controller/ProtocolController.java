package com.coenterprise.controller;

import com.coenterprise.entity.Protocol;
import com.coenterprise.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class ProtocolController {

    @Autowired
    private ProtocolService protocolService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showProtocolForm(Model model) {
        model.addAttribute("protocol",new Protocol());
        return "listprotocols";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String saveProtocol( Model model, Protocol protocol) {
        Protocol existing = protocolService.findByProtocolName(protocol.getName());
        if (existing != null) {
            model.addAttribute("status", "exist");
            return "index";
        }
        protocol.setCreatedOn(new Date());
        protocolService.saveProtocol(protocol);
        model.addAttribute("saved", "success");
        return "index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchProtocol(Model model, Protocol protocol) {
        List<Protocol> protocols = protocolService.findProtocols(protocol.getName());
        model.addAttribute("protocols", protocols);
        model.addAttribute("search", true);
        return "index";
    }

    @RequestMapping(value = "/edit/{protocolName}", method = RequestMethod.GET)
    public String updateProtocol(Model model, @PathVariable String protocolName) {
        Protocol protocol = protocolService.findByProtocolName(protocolName);
        model.addAttribute("protocol", protocol);
        return "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateProtocol( Model model, Protocol protocol) {
        protocolService.saveProtocol(protocol);
        model.addAttribute("saved", "success");
        return "update";
    }
    @RequestMapping(value = "/delete/{protocolName}", method = RequestMethod.GET)
    public String deleteProtocol(Model model, @PathVariable String protocolName) {
        protocolService.deleteProtocol(protocolName);
        model.addAttribute("deleted", "success");
        model.addAttribute("protocol", new Protocol());
        return "index";
    }

}
