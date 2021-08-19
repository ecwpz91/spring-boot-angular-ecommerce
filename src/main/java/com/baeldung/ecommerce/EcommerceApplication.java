package com.baeldung.ecommerce;

import com.baeldung.ecommerce.model.Product;
import com.baeldung.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// import io.jaegertracing.Configuration;
// import io.jaegertracing.Configuration.ReporterConfiguration;
// import io.jaegertracing.Configuration.SamplerConfiguration;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    // @Bean
	// public io.opentracing.Tracer initTracer() {
	// 	SamplerConfiguration samplerConfig = new SamplerConfiguration().withType("const").withParam(1);
	// 	ReporterConfiguration reporterConfig = ReporterConfiguration.fromEnv().withLogSpans(true);
	// 	return Configuration.fromEnv("ecommerce").withSampler(samplerConfig).withReporter(reporterConfig).getTracer();
	// }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "TV Set", 300.00, "http://placehold.it/200x100"));
            productService.save(new Product(2L, "Game Console", 200.00, "http://placehold.it/200x100"));
            productService.save(new Product(3L, "Sofa", 100.00, "http://placehold.it/200x100"));
            productService.save(new Product(4L, "Icecream", 5.00, "http://placehold.it/200x100"));
            productService.save(new Product(5L, "Beer", 3.00, "http://placehold.it/200x100"));
            productService.save(new Product(6L, "Phone", 500.00, "http://placehold.it/200x100"));
            productService.save(new Product(7L, "Watch", 30.00, "http://placehold.it/200x100"));
        };
    }
}
