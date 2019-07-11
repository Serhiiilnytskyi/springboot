package lits.com.springboot.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

@TestConfiguration
@ComponentScan(basePackages = "lits.com.springboot", lazyInit = true)
public class MockConfiguration {
}
