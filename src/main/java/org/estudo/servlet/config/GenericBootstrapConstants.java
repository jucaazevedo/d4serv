package org.estudo.servlet.config;

/**
 * Generic constants for Bootstrapping the WebApp
 * 
 * @author pablo.biagioli
 *
 */
public class GenericBootstrapConstants {

	/**
	 * "com.sun.jersey.config.property.packages", packages separated by commas
	 */
	public static final String JERSEY_PROPERTY_PACKAGES="org.estudo.rest";
	
	/**
	 * main properties file that gets loaded at first
	 */
	public static final String BOOTSTRAP_PROPERTIES_FILE="bootstrap.properties";
}
