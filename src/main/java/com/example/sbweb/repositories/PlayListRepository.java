package com.example.sbweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbweb.entities.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList,Integer>
{

}
