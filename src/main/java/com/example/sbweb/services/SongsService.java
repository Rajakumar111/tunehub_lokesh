package com.example.sbweb.services;

import java.util.List;

import com.example.sbweb.entities.Songs;

public interface SongsService {
	public String addSongs(Songs song);
	public boolean songExists(String name);
	public List<Songs> fetchAllSongs();

}
