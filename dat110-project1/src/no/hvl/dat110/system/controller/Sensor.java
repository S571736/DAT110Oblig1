package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.RPCStub;
import no.hvl.dat110.rpc.RPCUtils;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {

		byte[] request = RPCUtils.marshallVoid(RPCID);
		byte[] reply = rmiclient.call(request);
		
		// implement marshalling, call and unmarshalling for read RPC method

		return RPCUtils.unmarshallInteger(reply);
	}
	
}
