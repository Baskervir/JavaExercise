package ch07.sec10.exam02;

public abstract class Animal {
    public void breath() {  //메서드 선언
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();   //추상 메서드 선언
}
