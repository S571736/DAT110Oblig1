package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.*;
import no.hvl.dat110.system.sensor.SensorImpl;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {

		SensorImpl sensor = new SensorImpl();
		int temperary = sensor.read();
		int temp;

		byte[] request = RPCUtils.marshallInteger(RPCID, temperary);
		byte[] reply = rmiclient.call(request);

		temp = RPCUtils.unmarshallInteger(reply);
		// TODO
		// implement marshalling, call and unmarshalling for read RPC method

		return temp;
	}
	
}
