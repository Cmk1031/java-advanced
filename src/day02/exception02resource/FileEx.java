package day02.exception02resource;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args)  {
        FileWriter file = null;
        try {
            file = new FileWriter("data.txt");
            file.write("Java Advance Programming");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        try-with-resources 문의 괄호 () 객체를 생성하는 문장을 넣으면
        따로 close() 호출하지 않아도 try 블럭을 벗어나는 순간 자동적으로 close()가 호출된다.
        다음에 catch블럭이나 finally 블럭이 수행된다.
         */
        try(FileWriter file1 = new FileWriter("data2.txt")) {
            file1.write("Java Programming");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //data.txt파일의 내용을 읽겠다!
        try(
        FileInputStream fis = new FileInputStream("data.txt");
        DataInputStream dis = new DataInputStream(fis);
        ) {
            int sum = 0;
            while(true) {
                int value = dis.read();
                System.out.println(value);
                sum+=value;
            }
        } catch (EOFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
