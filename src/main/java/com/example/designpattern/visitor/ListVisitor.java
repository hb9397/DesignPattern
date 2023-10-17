package com.example.designpattern.visitor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import java.util.Iterator;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ListVisitor implements Visitor{
    // 현재 디렉토리 이름 출력
    private String currentDirName;


    // 파일 방문했을 때 처리 로직
    @Override
    public void visit(File file) {
        System.out.println(currentDirName + "/" + file.getName());
    }

    // 디렉토리 방문했을 때 처리 로직
    @Override
    public void visit(Directory directory) {


        System.out.println(currentDirName + "/" + directory.getName());

        String saveDirName = currentDirName;

        currentDirName = currentDirName + "/" + directory.getName();

        Iterator<Element> it = directory.iterator();

        while(it.hasNext()){
            Element element = it.next();
            element.accept(this);
        }
        currentDirName = saveDirName;
    }
}
