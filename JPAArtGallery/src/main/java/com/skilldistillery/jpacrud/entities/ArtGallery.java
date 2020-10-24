package com.skilldistillery.jpacrud.entities;

import javax.persistence.*;

@Entity
public class ArtGallery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="first_name")
	private String firstName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public ArtGallery() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArtGallery [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append("]");
		return builder.toString();
	}

}
