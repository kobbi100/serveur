package serveur.client.Controller;

import serveur.client.Entity.Produit;
import serveur.client.Service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin("*")
public class ProduitController {
    @Autowired
    IProduitService produitService;
    @GetMapping
    public List<Produit> getProduits(){
        return  produitService.getProduits();
    }
   @PostMapping
    public void addProduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }
    @DeleteMapping("/{ref}")
    public void deleteProduit(@PathVariable String ref){
        produitService.deleteproduit(ref);
    }
   @PutMapping
    public void updateProduit(@RequestBody Produit produit){
        produitService.updateProduit(produit);
   }
}
