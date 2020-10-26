package com.skilldistillery.jpacrud.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.ArtGallery;
@Transactional
@Service
public class ArtGalleryDAOImpl implements ArtGalleryDAO {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public ArtGallery findById(int id) {
		return em.find(ArtGallery.class, id);
	}

	@Override
	public List<ArtGallery> findAll() {
		String jpql = "SELECT a FROM Artgallery a";
		return em.createQuery(jpql, ArtGallery.class).getResultList();
	}

}
