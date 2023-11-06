package com.fst.srt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fst.srt.entities.Client;

import static com.fst.srt.DemoApplication.clients;




@Controller
@RequestMapping("/fournisseur")
public class FournisseurController {
	@GetMapping("/produit")
	//@ResponseBody
	public String info(Model model)
	{
		List<String> noms=new ArrayList<>();
		
		noms.add("Ameni");
		noms.add("Emna");
		noms.add("Oumayma");
		noms.add("Rima");
		String enseignat="NaderBelhadj";
		String classe="srt";
		int number = 533333333;
		model.addAttribute("ens",enseignat);
		model.addAttribute("cl",classe);
		model.addAttribute("num",number);
		model.addAttribute("noms", noms);
		
		
		model.addAttribute("clients", clients);
		return "data.html";
	
	}
	
	@GetMapping("/client")
	
	public String publier()
	{
		return "client.html";
	}
	@PostMapping("/client")
	//@ResponseBody
	public String ajouter(@RequestParam("nom")String nom, @RequestParam("prenom") String prenom,
			@RequestParam("email") String email)
	{
		Client c4=new Client(4,nom,prenom,email);
		clients.add(c4);
		return "redirect:produit" ;
	}
	

}
