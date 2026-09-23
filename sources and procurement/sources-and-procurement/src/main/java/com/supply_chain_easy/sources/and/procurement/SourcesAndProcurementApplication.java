package com.supply_chain_easy.sources.and.procurement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({
        "com.supply_chain_easy",
        "com.supply_chain_base_operation"
})
public class SourcesAndProcurementApplication {


	public static void main(String[] args) {



        SpringApplication.run(SourcesAndProcurementApplication.class, args);




	}

}
