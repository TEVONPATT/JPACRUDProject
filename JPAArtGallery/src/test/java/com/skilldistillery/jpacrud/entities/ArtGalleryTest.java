package com.skilldistillery.jpacrud.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArtGalleryTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private ArtGallery artGallery;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("artPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		artGallery = em.find(ArtGallery.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		artGallery = null;
	}

	@Test
	void test_Art_Gallery_entity_mapping() {
		assertNotNull(artGallery);
		assertEquals("Vincent", artGallery.getFirstName());
		assertEquals("van Gogh", artGallery.getLastName());
		assertEquals("Post-Impressionism", artGallery.getArtStyle());
		assertEquals(1853, artGallery.getBirthYear());
		assertEquals(1890, artGallery.getDeathYear());
	}

}
