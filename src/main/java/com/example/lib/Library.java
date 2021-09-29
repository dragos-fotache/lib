package com.example.lib;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Library {
    public void calculateStuff() {

        log.debug("doing something from lib");

    }
}
