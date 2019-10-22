package com.tutorialsninja.automation.config;


import java.io.IOException;
import java.util.Properties;
import com.tutorialsninja.automation.util.PathHelper;


public class PropertyFileReader implements ConfigurationReader{
	
	Properties properties=null;
	
	
	//This Constructor helps in initializing the config.properties file means loading the file
	//'PathHelper.java' class is used to append the System user directory(i.e) "usr.dir" to the "config.properties" path
	public PropertyFileReader() {
		properties=new Properties();
		try {
			properties.load(PathHelper.getInputStreamResourcePath("/src/main/resources/ConfigurationFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//These below 3 methods are implementing the 'ConfigurationReader.java' Interface declared methods
	public String getUrl() {
		return properties.getProperty("url");
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}

	
	}
