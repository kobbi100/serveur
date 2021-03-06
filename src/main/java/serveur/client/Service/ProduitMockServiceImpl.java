package serveur.client.Service;

import serveur.client.Entity.Produit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProduitMockServiceImpl implements IProduitService {
    private List<Produit> produits;
    public ProduitMockServiceImpl(){
        produits = new ArrayList<>();

        produits.add(new Produit("Livre", 50, 20));
        produits.add(new Produit("Cahier", 200, 5.25f));
        produits.add(new Produit("Stylo", 500, 2.10f));
    }
    @Override
    public List<Produit> getProduits() {
        return produits;
    }



    @Override
    public void updateProduit(Produit produit) {
     produits.remove(produit);
     produits.add(produit);
    }

    @Override
    public void deleteproduit(String ref) {
        Produit produit = new Produit();
        produit.setRef(ref);
        produits.remove(produit);
    }

    @Override
    public void addProduit(Produit produit) {
        produits.add(produit);
    }
}
