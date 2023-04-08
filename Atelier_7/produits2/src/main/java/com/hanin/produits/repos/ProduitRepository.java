package com.hanin.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hanin.produits.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}