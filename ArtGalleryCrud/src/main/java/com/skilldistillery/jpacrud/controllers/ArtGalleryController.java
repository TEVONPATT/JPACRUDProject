package com.skilldistillery.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.jpacrud.data.ArtGalleryDAO;
import com.skilldistillery.jpacrud.entities.ArtGallery;

@Controller
public class ArtGalleryController {
	@Autowired
	private ArtGalleryDAO artGalleryDao;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(Model model) {
		List<ArtGallery> artistList = artGalleryDao.findAll();
		model.addAttribute("artists", artistList);
		return "index";
	}
	
	@RequestMapping(path="getArtGallery.do")
	public String showArtGallery(Integer id, Model model) {
		ArtGallery artGallery = artGalleryDao.findById(id);
		model.addAttribute("artgallery", artGallery);
		return "artgallery/show";
		// return "index"; // if using a ViewResolver.
	}
}
