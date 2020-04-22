package org.deta.boot.server;
import java.io.IOException;

import org.deta.boot.vpc.controller.ServerInitController;

import sample.AppBoot;
public class BootVPCS {
	public static void main(AppBoot app, String[] args) throws IOException {
		ServerInitController.initServer(app);
	}
}