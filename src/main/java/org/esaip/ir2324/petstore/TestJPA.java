package org.esaip.ir2324.petstore;

import org.esaip.ir2324.petstore.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class TestJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Mes entités
        Address address = new Address();
        address.setNumber("123");
        address.setStreet("Main St");
        address.setZipCode("12345");
        address.setCity("Sample City");

        PetStore store = new PetStore();
        store.setName("Awesome Pet Store");
        store.setManagerName("John Doe");
        store.setAddress(address);

        Product product = new Product();
        product.setCode("P001");
        product.setLabel("Cat Food");
        product.setType(ProdType.FOOD);
        product.setPrice(19.99);
        product.setPetStore(store);

        Animal cat = new Cat();
        cat.setBirth(new Date());
        cat.setCouleur("Brown");
        ((Cat) cat).setChipId("CHP123");
        cat.setPetStore(store);

        em.persist(address);
        em.persist(store);
        em.persist(product);
        em.persist(cat);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
