package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class RPCUtils {

    public static byte[] marshallString(byte rpcid, String str) {

        byte[] encoded = new byte[str.length() + 1];

        encoded[0] = rpcid;
        for (int i = 0; i < str.length(); i++) {
            encoded[i + 1] = (byte) str.charAt(i);
        }


        // TODO: marshall RPC identifier and string into byte array


        return encoded;
    }

    public static String unmarshallString(byte[] data) {

        String decoded = new String(Arrays.copyOfRange(data, 1, data.length));


        // TODO: unmarshall String contained in data into decoded


        return decoded;
    }

    public static byte[] marshallVoid(byte rpcid) {

        byte[] encoded = new byte[1];

        encoded[0] = rpcid;

        // TODO: marshall RPC identifier in case of void type

        return encoded;

    }

    public static void unmarshallVoid(byte[] data) {
        return;
        // TODO: unmarshall void type
    }

    public static byte[] marshallBoolean(byte rpcid, boolean b) {

        byte[] encoded = new byte[2];

        encoded[0] = rpcid;

        if (b) {
            encoded[1] = 1;
        } else {
            encoded[1] = 0;
        }

        return encoded;
    }

    public static boolean unmarshallBoolean(byte[] data) {

        return (data[1] > 0);

    }

    public static byte[] marshallInteger(byte rpcid, int x) {

        byte[] encoded = new byte[4];
        encoded = ByteBuffer.allocate(4).putInt(x).array();
        return encoded;


        // TODO: marshall RPC identifier and string into byte array

    }

    public static int unmarshallInteger(byte[] data) {

        int decoded;

        // TODO: unmarshall integer contained in data
        decoded = ByteBuffer.wrap(data).getInt();

        return decoded;

    }
}
