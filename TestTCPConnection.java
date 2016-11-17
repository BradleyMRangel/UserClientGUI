/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradley
 */
public class TestTCPConnection {
    public static void main(String args[]) {
        System.out.println("Trying to connect");
        try {
        TCPConnection connection = TCPConnection.getInstance();
        String test = "fkdajfkd";
        System.out.println(connection.readWrite(test));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Connected");
    }
}
