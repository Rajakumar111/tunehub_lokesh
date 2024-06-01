package com.example.sbweb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sbweb.entities.PlayList;
import com.example.sbweb.entities.Songs;
import com.example.sbweb.services.PlayListService;
import com.example.sbweb.services.SongsService;


@Controller
public class PlaylistController {

	@Autowired
	PlayListService pserv;
	@Autowired
	SongsService sserv;
	
	@GetMapping("/createplaylist")
	public String createPlayList(Model model) {
		List<Songs> songslist=sserv.fetchAllSongs();
		model.addAttribute("songslist",songslist);
		return "createplaylist";
	}
	@PostMapping("/addplaylist")
	public String addPlayList(@ModelAttribute PlayList playlist) {
		
		return "playlistsuccess";
	}

}
