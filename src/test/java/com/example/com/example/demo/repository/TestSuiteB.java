package com.example.com.example.demo.repository;

import com.example.com.example.demo.utils.SomeOtherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = {SomeOtherService.class})
class TestSuiteB extends AbstractJpaDatabaseTest {

    @Autowired
    private FooBarRepository repository;

    @Test
    void bar() {
        assertThat(repository.count()).isEqualTo(0);
    }

}