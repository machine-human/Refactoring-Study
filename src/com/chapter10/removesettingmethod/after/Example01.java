package com.chapter10.removesettingmethod.after;

//쓰기 메서드 제거
//하지만 위의 예제는 매개변수로 계싼을 수행할 때 드러남
//수정이 간단할때는 생성자를 수성해도 되지만, 수정이 복잡하거나
//별도의 메서드에서 호출해야 할 때는 따로 메서드를 하나 작성해야 함
public class Example01 {
    private final String id;

    Example01(String id) {
        this.id = id;
    }
}




