package org.helloworldmvc.controller;

import org.helloworldmvc.Contract.IModel;
import org.helloworldmvc.Contract.IView;

public class Controller {
	private final IView view;
	private final IModel model;
	public Controller(IView view, IModel model){
		this.view = view;
		this.model = model;
	}
	public void run(){
		this.view.displayMessage(this.model.getHelloWorld());
	}
}
