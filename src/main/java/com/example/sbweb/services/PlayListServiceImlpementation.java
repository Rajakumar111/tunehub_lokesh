package com.example.sbweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sbweb.repositories.PlayListRepository;



@Service
public class PlayListServiceImlpementation implements PlayListService{
@Autowired	
PlayListRepository prepo;

}
