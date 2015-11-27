package org.dy.ws.publish;

import javax.xml.ws.Endpoint;

import org.dy.ws.service.impl.HelloWorldWS;

public class Publisher {
	public static void main(String[] args) {
		HelloWorldWS helloWorldWS = new HelloWorldWS();
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/helloworldws", helloWorldWS);
		System.out.println("service published...");
	}
}
