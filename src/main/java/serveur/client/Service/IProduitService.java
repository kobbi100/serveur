package serveur.client.Service;

import serveur.client.Entity.Produit;

import java.util.List;


public interface IProduitService {
    List<Produit> getProduits();
    public void updateProduit(Produit produit);
    public void deleteproduit(String ref);
    public void addProduit(Produit produit);}
