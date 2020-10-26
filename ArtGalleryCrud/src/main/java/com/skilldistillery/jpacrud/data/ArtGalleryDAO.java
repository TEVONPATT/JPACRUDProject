package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.ArtGallery;

public interface ArtGalleryDAO {
	 ArtGallery findById(int id);

	public List<ArtGallery> findAll();

}
