package com.rialvalue.crx.learning.simpleBundle;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.rialvalue.crx.learning.simpleBundle.services.SampleService;
import com.rialvalue.crx.learning.simpleBundle.services.impl.SampleServiceImpl;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		SampleService service = new SampleServiceImpl();
		context.registerService(SampleService.class.getName(), service,
				new Hashtable<Object, Object>());
	}

	public void stop(BundleContext arg0) throws Exception {
		System.err.println("stopping service");
	}
}
