package jdbc.advanced.users;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String memId;
    private String memName;
    private String memPass;
    private String memTel;
    private String memAddr;
}
