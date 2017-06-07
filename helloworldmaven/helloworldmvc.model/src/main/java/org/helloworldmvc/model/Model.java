package org.helloworldmvc.model;

import org.helloworldmvc.Contract.IModel;

public class Model implements IModel {
	public String getHelloWorld(){
		return DAOHelloWorld.getInstance().getHelloWorldMessage();
	}
}
