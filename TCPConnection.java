
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradley Rangel & Matthew Anderson
 */


public class TCPConnection {
    
    private static TCPConnection conn;
    private static Socket clientSocket;
    //private static String ipAddress = "192.168.1.104";
    //private static String ipAddress = "192.168.1.106";
    private static String ipAddress = "10.0.0.153";
    private static int Port = 1025;
    
    public static TCPConnection getInstance() throws UnknownHostException, IOException {
        if (conn == null) {
            // do the stuff to instantiate it
            conn = new TCPConnection();
            clientSocket = new Socket(ipAddress, Port);
            
        }
        return conn;
    }
    
    protected TCPConnection(){
        //exists to not allow instantiation;
    }
    
    public String readWrite(String clientInfo) throws IOException{
        
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        byte[] msgText = clientInfo.getBytes();
        BufferedReader inFromServer = new BufferedReader
        (new InputStreamReader(clientSocket.getInputStream()));
        outToServer.write(msgText);
        String serverResponse = inFromServer.readLine();
        System.out.println("FROM SERVER: " + serverResponse);
        return serverResponse;
    }
    
    public String getMACAddress(){
        InetAddress ip;
        String macAddress = null;
	try {

		ip = InetAddress.getLocalHost();
		System.out.println("Current IP address : " + ip.getHostAddress());

		NetworkInterface network = NetworkInterface.getByInetAddress(ip);

		byte[] mac = network.getHardwareAddress();
		System.out.print("Current MAC address : ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? ":" : ""));
		}
		System.out.println(sb.toString());
                macAddress = sb.toString();

	} catch (UnknownHostException e) {

		e.printStackTrace();

	} catch (SocketException e){

		e.printStackTrace();

	}
        return macAddress;
    }
    
    public void closeSocket() {
        try{
            clientSocket.close();
        } catch(IOException ex){
            System.out.println("This socket is closed, son");
        }
        //if connection is lost then socket can be created again
        conn = null;
    }
    
}
