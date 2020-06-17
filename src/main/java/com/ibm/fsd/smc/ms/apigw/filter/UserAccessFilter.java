package com.ibm.fsd.smc.ms.apigw.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserAccessFilter extends ZuulFilter {
	
	private static Logger logger = LoggerFactory.getLogger(UserAccessFilter.class);

	private static final String PRE_FILTER_TYPE = "pre";
	private static final int FILTER_ORDER = 0;
	private static final boolean SHOULD_FILTER = true;
	private static final String SYMBOL_SEMICOLON = ";";
	
	@Override
	public Object run() throws ZuulException {
		logger.debug("UserAccessFilter working ...");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return SHOULD_FILTER;
	}

	@Override
	public int filterOrder() {
		return FILTER_ORDER;
	}

	@Override
	public String filterType() {
		return PRE_FILTER_TYPE;
	}
	
}
