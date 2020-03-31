package com.bootstrap;


import data.models.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        User user = new User("user1","someemail");

    }
}
