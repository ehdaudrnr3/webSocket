 package com.spring.boot.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.spring.boot.websocket.handler.ChatHandler;
import com.spring.boot.websocket.handler.EchoHandler;
import com.spring.boot.websocket.handler.EchoSockJsHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(echoHandler(), "/echo-ws");
		registry.addHandler(echoSockJsHandler(), "/echo.sockjs").setAllowedOrigins("http://localhost:8080").withSockJS();
		registry.addHandler(chatHandler(), "/chat-ws");
	}
	
	@Bean
	public EchoHandler echoHandler() {
		return new EchoHandler();
	}
	
	@Bean
	public EchoSockJsHandler echoSockJsHandler() {
		return new EchoSockJsHandler();
	}
	
	@Bean
	public ChatHandler chatHandler() {
		return new ChatHandler();
	}
}
