package com.example.sbweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.sbweb.entities.Songs;
import com.example.sbweb.services.SongsService;

@Controller
public class SongsController {
	                                     
	@Autowired
	SongsService songserv;
	
	@PostMapping ("/addsongs")
	public String addSongs(@ModelAttribute Songs song) {
		String name=song.getName();
		boolean status=songserv.songExists(name);
		if(status==false)
		{
			songserv.addSongs(song);
			return "songsuccess";
		}
		else
		{
			return "songfail";
		}
	}
		@GetMapping("/map-viewsongs")
		public String viewSongs(Model model)
		{
			List<Songs>songslist=songserv.fetchAllSongs();
		    model.addAttribute("songslist",songslist);
			return "displaysongs";
			
		}
		@GetMapping("/viewsongs")
		public String viewCustomerSongs(Model model) {
		boolean primeCustomerStatus=true;
		if(primeCustomerStatus==true)
		{
			List<Songs> songslist=songserv.fetchAllSongs();
			model.addAttribute("songslist",songslist);
			return "displaysongs";
		}
		else
		{
		return "makepayment";	
		}
	}
}
