package com.capgemini.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FacebookController {

	public void createProfile() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name ");
		String name=br.readLine();
		
		System.out.println("Enter Password ");
		String pass=br.readLine();
		
		System.out.println("Enter EMAIL ");
		String email=br.readLine();
		
		System.out.println("Enter Address ");
		String address=br.readLine();
		
		System.out.println("your data is below");
		System.out.println("name is "+name);
		System.out.println("password is "+pass);
		System.out.println("email is "+email);
		System.out.println("address is "+address);
		
	}

	public void viewProfile() throws Exception {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("your data is below" );
	String name=br.readLine();
	
		
		
	}

	public void editProfile() throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
				
				System.out.println(" edit profile name : ");
				String profile=br.readLine();
				
				System.out.println("bio ");
				String bio =br.readLine();
				
				System.out.println("Hobbies ");
				String hobbies=br.readLine();
				
				System.out.println("featured ");
				String featured=br.readLine();

				System.out.println("your data is below");
				System.out.println("bio" +bio);
				System.out.println("hobbies" +hobbies);
				System.out.println("featured" +featured);
				
	}

	public void deleteProfile()  throws Exception {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		System.out.println(" delete profile name : ");
		String profile=br.readLine();
		System.out.println("your data is below");
		System.out.println("delete profile is "+profile);
	}

	public void searchProfile()  throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		System.out.println(" search profile name : ");
		String profile=br.readLine();
		System.out.println("your data is below");
		System.out.println("search profile is "+profile);
	}

	public void viewAllProfile()  throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		System.out.println(" view profile  : ");
		String profile=br.readLine();
		System.out.println("your data is below");
		System.out.println("view profile is "+profile);
	}

	public void loginProfile()  throws Exception {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		
		System.out.println(" username: ");
		String username=br.readLine();
		System.out.println(" password ");
		String password=br.readLine();
		
		
		System.out.println("your data is below");
		
		System.out.println("Username  "+username);
		System.out.println("password  "+password);
		System.out.println("  profile created ");
		
	}

	public void uploadProfile() throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		System.out.println(" Upload profile : ");
		String profile=br.readLine();
		System.out.println("your data is below");
		System.out.println("upload "+profile);
		
	}


}
