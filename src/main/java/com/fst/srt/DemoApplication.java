package com.fst.srt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fst.srt.entities.Client;

@SpringBootApplication
public class DemoApplication {
	public static List<Client> clients=new ArrayList<>();
	public static void main(String[] args) {
		
		
		Client c1= new Client(1,"Hela","Elbez","hel@yahoo.fr");
		Client c2= new Client(2,"Rania","Loussif","ran@gmail.com");
		Client c3= new Client(3,"Oumayma","salhi","sal@gmail.com");
		clients.add(c1);
		clients.add(c2);
		clients.add(c3);
		SpringApplication.run(DemoApplication.class, args);
	}

}
