package com.example.designpattern.visitor;

import lombok.*;

import java.util.ArrayList;
import java.util.Iterator;

@Getter
@ToString
@Builder
@AllArgsConstructor
public class Directory implements Element{
    private final String name;
    private final ArrayList<Element> dir = new ArrayList<>();

    public Element add(Element element){
        dir.add(element);
        return this;
    }

    public Iterator<Element> iterator(){
        return dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
