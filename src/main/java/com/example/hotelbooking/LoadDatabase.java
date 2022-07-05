package com.example.hotelbooking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository eRepository, customerRepository cRepository , adminRepository aRepository) {

    return args -> {
      log.info("Preloading " + eRepository.save(new Employee("Raya", "Database Administriter")));
      log.info("Preloading " + eRepository.save(new Employee("Makame", "HR")));
      log.info("Preloading" + eRepository.save(new Employee("hamiary","developer")));
      log.info("Precloading" + cRepository.save(new customer(1,"juma","alii" , "founi" ,"juma@gmail.com","0777777",
      "12345")));
      log.info("Precloading" + cRepository.save(new customer(2,"suleiman","suleiman","fourHouse","sule@gmail.com","0675446789",
      "098765"))); 
      log.info("Precloading" + cRepository.save(new customer(3,"zuhura","Haji","Jumbi","zuhurahaji01@gmail.com","0774897643",
      "zuhura2020"))); 
      log.info("Preloading" + eRepository.save(new Employee("Masoud","Network Administrater")));
      log.info("Preloading" + aRepository.save(new admin(1,"Mwinyi","michenzani","mwinyi101@hotmail")));


    };
  }
}