package com.example.designpattern.visitor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientCode {
    public static void main(String[] args) {
        // 현재 디렉토리 => home 의 하위 디렉토리 workspace 경로 찾기
        Directory workSpaceDir = Directory.builder().name("workspace").build();

        // /home/workspace 하위의 디렉토리 경로 찾기
        Directory compositeDir = Directory.builder().name("Visitor").build();
        Directory testDir1 = Directory.builder().name("testUser1").build();
        Directory testDir2 = Directory.builder().name("testUser2").build();

        // /home/workspace 하위의 디렉토리 경로 방문
        workSpaceDir.add(compositeDir);
        workSpaceDir.add(testDir1);
        workSpaceDir.add(testDir2);

        // /home/workspace/Visitor 하위에 존재하는 파일 경로 찾기
        File element = new File("Element.java");
        File entity = new File("Entity.java");
        File file = new File("File.java");
        File directory = new File("Directory.java");
        File visitor = new File("Visitor.java");
        File listVisitor = new File("ListVisitor.java");
        File main = new File("Main.java");

        //home/workspace/Visitor 하위에 존재하는 파일 방문
        compositeDir.add(element);
        compositeDir.add(entity);
        compositeDir.add(file);
        compositeDir.add(directory);
        compositeDir.add(visitor);
        compositeDir.add(listVisitor);
        compositeDir.add(main);

        // 현재 /home 디렉토리에서 하위의 /workspace 아래의 경로 중 방문한 디렉토리와 파일에 대한 열람 기록 처리를 승인
        workSpaceDir.accept(new ListVisitor("/home"));
    }
}
