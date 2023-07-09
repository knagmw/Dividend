package com.example.dividend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
public class DividendApplication {
    public static void main(String[] args) {
        SpringApplication.run(DividendApplication.class, args);

//        Trie trie = new PatriciaTrie();
//        AutoComplete autoComplete = new AutoComplete(trie);
//        AutoComplete autoComplete1 = new AutoComplete(trie);
//
//        autoComplete.add("hello");
//        autoComplete1.add("hello");
//
//        System.out.println(autoComplete.get("hello"));
//        System.out.println(autoComplete1.get("hello"));
    }
}
