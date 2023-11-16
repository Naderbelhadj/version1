package com.fst.srt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String ajouter(@RequestParam("id") int id,@RequestParam("nom")String nom, @RequestParam("prenom") String prenom,
			@RequestParam("email") String email)
	{
		Client c4=new Client(id,nom,prenom,email);
		clients.add(c4);
		return "redirect:produit" ;
	}
	@GetMapping("delete/{id}")
	//@ResponseBody
	public String supprimer(@PathVariable("id") int id)
	{
		//model.addAttribute("id", id);
		for(Client c:clients)
		{
		if(c.getId()==id)
		{
		clients.remove(c);
				break;
		}
		}
		
		return "redirect:../produit";
				
	}
	
}
