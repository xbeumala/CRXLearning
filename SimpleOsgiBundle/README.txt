This file runs on: http://localhost:7402/content/jcrTest/sample1/

Node created on: /content/jcrTest/sample1
	sling:resourceType = jcrTest/sample1
	
File added on: /apps/jcrTest/sample1/GET.esp
	<%
	    var service = sling.getService( Packages.com.rialvalue.jcrTest.services.SampleService);
	%>
	
	<%= service.sayHello() %>
	

