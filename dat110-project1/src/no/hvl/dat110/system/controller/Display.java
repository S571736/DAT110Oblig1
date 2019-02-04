package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.*;

public class Display extends RPCStub {

	private byte RPCID = 1;

	public void write(String message) {

		byte[] request = RPCUtils.marshallString(RPCID, message);
		byte[] reply = rmiclient.call(request);

		String temperature = RPCUtils.unmarshallString(reply);

		System.out.println("" + temperature);


		// implement marshalling, call and unmarshalling for write RPC method

		//throw new RuntimeException("not yet implemented");
	}
}
