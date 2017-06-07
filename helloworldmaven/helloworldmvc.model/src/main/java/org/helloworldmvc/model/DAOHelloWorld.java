package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAOHelloWorld {
	private String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance  = null ;
	private String helloWorldMessage = null;
	
	private void DAOHelloWorld(){
		
		
	}

	public static DAOHelloWorld getInstance() {
		return instance;
	}

	private void setInstance(DAOHelloWorld instance) {
		this.instance = instance;
	}
	private void readFile(){
		BufferedReader buffer;
		try{
			buffer = new BufferedReader(new InputStreamReader(new FileInputStream(FileName)));
			this.setHelloWorldMessage(buffer.readLine());
			buffer.close();
		} catch (final FileNotFoundException exception){
			exception.printStackTrace();
		}catch (final IOException exception){
			exception.printStackTrace();
		}
	}

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
}
