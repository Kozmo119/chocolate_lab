package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class Dataloader implements ApplicationRunner {
    @Autowired // dependency injection
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate estate1 = new Estate("Mani","UK");
        estateRepository.save(estate1);

        Chocolate chocolate1 = new Chocolate("WhiteCoco",50, estate1);
        chocolateRepository.save(chocolate1);

        Chocolate chocolate2 = new Chocolate("Coco", 85,estate1);
        chocolateRepository.save(chocolate2);

        Estate estate2 = new Estate("Kozmo","Nepal");
        estateRepository.save(estate2);

        Chocolate chocolate3 = new Chocolate("DarkCoco", 70, estate2);
        chocolateRepository.save(chocolate3);


    }
}
