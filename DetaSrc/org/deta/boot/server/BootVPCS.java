package org.deta.boot.server;
import java.io.IOException;

import org.deta.boot.vpc.controller.ServerInitController;

import sample.App3;
public class BootVPCS {
	public static void main(App3 app, String[] args) throws IOException {
		ServerInitController.initServer(app);
	}
}