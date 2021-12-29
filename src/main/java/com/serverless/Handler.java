package com.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Object, String>{


	@Override
	public String handleRequest(Object input, Context context) {
		context.getLogger().log("Input:" +input);
		return "Hello World";
	}
}
	