/**
 * 
 */
package com.example.demo1.POJO;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
* @Title: Resource
* @Description:
* @author caohaishan
* @date 2018年8月27日  
*/
@Configuration
@ConfigurationProperties(prefix="com.example.opensource")
@PropertySource(value="classpath:resource.properties")
public class Resource {
	private String name;
	private String website;
	private String language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
