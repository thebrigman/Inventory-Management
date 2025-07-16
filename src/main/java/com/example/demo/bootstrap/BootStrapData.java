package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (outsourcedPartRepository.count() == 0) {
            OutsourcedPart burgerPatty= new OutsourcedPart();
            burgerPatty.setCompanyName("Samson Foods");
            burgerPatty.setName("burger patty");
            burgerPatty.setInv(20);
            burgerPatty.setPrice(2.0);
            burgerPatty.setId(100L);
            burgerPatty.setMinInv(5);
            burgerPatty.setMaxInv(50);
            outsourcedPartRepository.save(burgerPatty);

            OutsourcedPart chickenBreast= new OutsourcedPart();
            chickenBreast.setCompanyName("Samson Foods");
            chickenBreast.setName("chicken breast");
            chickenBreast.setInv(20);
            chickenBreast.setPrice(2.0);
            chickenBreast.setId(101L);
            chickenBreast.setMinInv(5);
            chickenBreast.setMaxInv(50);
            outsourcedPartRepository.save(chickenBreast);

            OutsourcedPart cheese= new OutsourcedPart();
            cheese.setCompanyName("Samson Foods");
            cheese.setName("cheese");
            cheese.setInv(20);
            cheese.setPrice(.50);
            cheese.setId(102L);
            cheese.setMinInv(5);
            cheese.setMaxInv(50);
            outsourcedPartRepository.save(cheese);

            OutsourcedPart bacon= new OutsourcedPart();
            bacon.setCompanyName("Samson Foods");
            bacon.setName("bacon");
            bacon.setInv(40);
            bacon.setPrice(1.0);
            bacon.setPrice(1.00);
            cheese.setId(103L);
            bacon.setMinInv(5);
            bacon.setMaxInv(50);
            outsourcedPartRepository.save(bacon);

            OutsourcedPart potatoBun= new OutsourcedPart();
            potatoBun.setCompanyName("Samson Foods");
            potatoBun.setName("potato bun");
            potatoBun.setInv(20);
            potatoBun.setPrice(1.0);
            potatoBun.setPrice(1.00);
            potatoBun.setId(104L);
            potatoBun.setMinInv(5);
            potatoBun.setMaxInv(50);
            outsourcedPartRepository.save(potatoBun);

        }

        if (productRepository.count() == 0) {
            Product classicBurger= new Product("classic burger",3.0,0);
            Product chickenSandwich= new Product("chicken sandwich",3.0,0);
            Product baconBurger= new Product("bacon burger",4.0,0);
            Product cheeseBurger= new Product("cheese burger",3.50,0);
            Product baconCheeseBurger= new Product("bacon cheese burger",4.50,0);

            productRepository.save(classicBurger);
            productRepository.save(chickenSandwich);
            productRepository.save(baconBurger);
            productRepository.save(cheeseBurger);
            productRepository.save(baconCheeseBurger);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());


//        OutsourcedPart thePart=null;
//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            if(part.getName().equals("out test"))thePart=part;
//        }
//
//        System.out.println(thePart.getCompanyName());
//
//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            System.out.println(part.getName()+" "+part.getCompanyName());
//        }


    }
}
