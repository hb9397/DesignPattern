package com.example.designpattern.visitor;

import org.springframework.stereotype.Component;

@Component
public interface Visitor {
    public void visit(File file);
    public  void visit(Directory directory);
}
