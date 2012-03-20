package com.copyright.rup.workflow.svc.project.service;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.copyright.rup.workflow.svc.project.api.ActivitiConfig;



public class TestWorkflowProjectServices
{
	
	
	 	@Test
	    public void testActivitiConfigBean() {
	        // create the spring container using the AppConfig
	        // @Configuration class
	        ApplicationContext ctx =
	              new AnnotationConfigApplicationContext(ActivitiConfig.class);
	        String bmeString = "one";
	        
	 	}
	

}
