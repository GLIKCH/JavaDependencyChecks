package com.snhu.restservice;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		
		SafeConstructor constructor = new SafeConstructor();

        // create an instance of Yaml with the SafeConstructor
        Yaml yaml = new Yaml(constructor);

        // load YAML data using the safe constructor
        String yamlData = "!!java/object '[Ljava.lang.Runtime.getRuntime();]'";
        Object data = yaml.load(yamlData);
		
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
