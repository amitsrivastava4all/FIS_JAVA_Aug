package com.fis;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;

public class Test {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		System.out.println("Enter the Host Name ");
		Scanner scanner= new Scanner(System.in);
		String hostName = scanner.next();
		InetAddress inet = InetAddress.getByName(hostName);
		//String ipAddress ="74.125.68.99";
		String ipAddress = inet.getHostAddress();
		System.out.println("IPAddress "+ipAddress);
		GeoIPService geoip = new GeoIPService();
		 GeoIP location  = geoip.getGeoIPServiceSoap().getGeoIP(ipAddress);
		 String countryName = location.getCountryName();
		 String countryCode= location.getCountryCode();
		 System.out.println("Name of the County "+countryName);
		 System.out.println("Code of the Country "+countryCode);
	}

}
