package org.tinos.vpcs.restServer;

import java.io.IOException;
import org.deta.boot.vpc.controller.ServerInitController;
import sample.AppBoot;

public class restServer extends Thread implements Runnable{
	private AppBoot app;
	public boolean ready= false;
	public restServer(AppBoot app) {
		//balabala here;
		this.app= app;
	}
	
	public void run() {
		try {
			ServerInitController.initServer(app);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}  