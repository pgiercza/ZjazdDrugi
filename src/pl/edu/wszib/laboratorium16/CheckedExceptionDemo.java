package pl.edu.wszib.laboratorium16;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        CheckedExceptionDemo ced=new CheckedExceptionDemo();
        ced.urlTester("ewfewfyuewjwe");
    }
    public void urlTester(String urlStr){
        try {
            URL url= new URL(urlStr);
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Niepoprawny URL: "+e.getMessage());
        }
    }

}

