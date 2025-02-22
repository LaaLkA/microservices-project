package com.laalka.userservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(properties = {
        "spring.cloud.config.enabled=false",
        "spring.cloud.config.fail-fast=false"
})
@ActiveProfiles("test")
class UserServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
