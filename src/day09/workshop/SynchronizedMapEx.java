package day09.workshop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SynchronizedMapEx {
    public static void main(String[] args) {
        //Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
        Map<Integer, String> map = new HashMap<>(); //스레드들의 경쟁으로 데이터의 접근이 안된 쓰레드는 저장 안됨


        //작업 스레드 객체 A 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                //객체 1000개 추가
                for(int i=1; i<=1000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        //작업 스레드 객체 B 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                //객체 1000개 추가
                for(int i=1; i<=1000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        //작업 스레드 실행
        threadA.start();
        threadB.start();

        //작업 스레드들이 모두 종료될때까지 메인 스레드를 기다리게 할 것임
        try{
            threadA.join();
            threadB.join();
        } catch(InterruptedException e) {
            System.out.println("외부 문제로 프로그램 종료");
        } catch(Exception e1) {
            e1.printStackTrace();
        }

        System.out.println(map.size());




    }
}
