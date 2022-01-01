package ru.mtuci.simpleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simpleapi.dao.ProductRepository;
import ru.mtuci.simpleapi.model.Product;

@Component
public class CommandLineStartupRunner implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Autowired
    public CommandLineStartupRunner(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String...args) throws Exception {
//        new Product();
        System.out.println(productRepository.findById(1L).get());
    }
}