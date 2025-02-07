package day05.innerClass.ex06.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder //빌드 메서드 생성
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 멤버를 적용한 생성자 오버로딩
@Data //Setter 메서드 생성
@Setter //Getter 메서드 생성
@Getter //toString 생성
@ToString
public class Person {
    private String name;
    private String age;
    private String gender;
    private String job;
    private String address;
}
