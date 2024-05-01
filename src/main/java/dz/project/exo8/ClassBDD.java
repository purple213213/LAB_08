package dz.project.exo8;

import java.sql.Date;
import java.time.LocalDate;
//import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Table;


 @Table("wilaya") // Annotation pour mapper la classe à la table de la base de données
public class ClassBDD {
	
	
	@Id // Annotation pour indiquer que cette propriété est la clé primaire de la table
private Integer id;
private Boolean actif;
private Integer compte_creation;
private Integer compte_maj;
private Date date_creation;
private Date date_maj;
private String nom_arabe;
private String nom_latin;
private String nom_tamazight;





public Integer getId() {
return id;
}
public void setId(Integer id) {
	this.id = id;
}



public String getNom_tamazight() {
	return nom_tamazight;
}
public void setNom_tamazight(String nom_tamazight) {
	this.nom_tamazight = nom_tamazight;
}
public String getNom_latin() {
	return nom_latin;
}
public void setNom_latin(String nom_latin) {
	this.nom_latin = nom_latin;
}
public Boolean getActif() {
	return actif;
}
public void setActif(Boolean actif) {
	this.actif = actif;
}
public Integer getCompte_creation() {
	return compte_creation;
}
public void setCompte_creation(Integer compte_creation) {
	this.compte_creation = compte_creation;
}
public Integer getCompte_maj() {
	return compte_maj;
}
public void setCompte_maj(Integer compte_maj) {
	this.compte_maj = compte_maj;
}
public Date getDate_creation() {
	return date_creation;
}
public void setDate_creation(Date date) {
	this.date_creation = date;
}
public Date getDate_maj() {
	return date_maj;
}
public void setDate_maj(Date date_maj) {
	this.date_maj = date_maj;
}
public String getNom_arabe() {
	return nom_arabe;
}
public void setNom_arabe(String nom_arabe) {
	this.nom_arabe = nom_arabe;
}

}
