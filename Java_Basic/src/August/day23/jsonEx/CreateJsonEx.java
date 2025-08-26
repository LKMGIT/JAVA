package August.day23.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class CreateJsonEx {

    public static void main(String[] args) throws IOException {
        // 1. JSON 객체 생서
        JSONObject root = new JSONObject();
        // 2. 속성 추가
        root.put("id","LKM");
        root.put("name","이경민");
        root.put("password","LKM1234");

        // 3. 배열 속성 추가
        JSONObject tel = new JSONObject();
        tel.put("home","010-1112-1112");
        tel.put("phone", "010-1111-1111");
        root.put("tel",tel);

        JSONArray skill = new JSONArray();
        skill.put("JAVA");
        skill.put("HTML");
        skill.put("JPA");
        root.put("skill",skill);

        // 4. JSON 얻기
        String json = root.toString();

        // 5. 콘솔에 입력
        System.out.println(json);

        //6. 파일에 출력
        Writer writer = new FileWriter("LKM.json");
        writer.write(json);
        writer.close();


    }


}
