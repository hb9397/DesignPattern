package com.example.designpattern.visitor;

import org.springframework.stereotype.Component;

@Component
public interface Element {
    void accept(Visitor visitor);
}
