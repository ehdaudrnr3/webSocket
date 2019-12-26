package com.spring.boot.websocket.controller;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebSocketController {
	
	@RequestMapping(value = "/")
	public ModelAndView index(ModelAndView model) {
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/echo")
	public ModelAndView echoWs(ModelAndView model) {
		model.setViewName("echo");
		return model;
	}
	
	@RequestMapping(value = "/echo_sock_js")
	public ModelAndView echo_sock_js(ModelAndView model) {
		model.setViewName("echo_sock_js");
		return model;
	}
	
	@RequestMapping(value = "/chat")
	public ModelAndView chat(ModelAndView model) {
		model.setViewName("chat");
		return model;
	}
}
