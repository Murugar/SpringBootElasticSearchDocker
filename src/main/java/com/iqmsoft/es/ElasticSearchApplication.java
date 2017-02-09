package com.iqmsoft.es;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories("com.iqmsoft.es.repository")
@EnableTransactionManagement
@EnableElasticsearchRepositories("com.iqmsoft.es.repository.search")
public class ElasticSearchApplication {

	
	
	public static void main(String[] args) {
        SpringApplication.run(ElasticSearchApplication.class, args);
    }
	
}
