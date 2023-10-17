package com.example.designpattern.visitor;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Builder
@AllArgsConstructor
public class File implements Element {
    private final String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
