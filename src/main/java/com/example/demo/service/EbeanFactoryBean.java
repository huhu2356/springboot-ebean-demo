package com.example.demo.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;

@Component
public class EbeanFactoryBean implements FactoryBean<EbeanServer>{

	@Override
	public EbeanServer getObject() throws Exception {
		return createEbeanServer();
	}

	@Override
	public Class<?> getObjectType() {
		return EbeanServer.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	private EbeanServer createEbeanServer() {
	    ServerConfig config = new ServerConfig();
	    config.setName("db");

//	    // set the spring's datasource and transaction manager.
//	    config.setDataSource(dataSource);
//	    config.setExternalTransactionManager(new SpringAwareJdbcTransactionManager());

	    config.loadFromProperties();
	    
	    config.setDefaultServer(true);
	    config.setRegister(true);
		
		return EbeanServerFactory.create(config);
	}
}
