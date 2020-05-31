package serveur.client.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    private String ref;
    private int quantite;
    private float prixUnitaire;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return Objects.equals(ref, produit.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref);
    }
}

