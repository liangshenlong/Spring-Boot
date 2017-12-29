package cn.hacz.edu.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.Iterator;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/29 时间:9:22
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Jackson04Test {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        // 对象转json
        ObjectNode createObjectNode = mapper.createObjectNode();
        createObjectNode.put("username", "小丑皇");
        createObjectNode.put("age", 12);
        createObjectNode.put("lover", false);
        String writeValueAsString = mapper.writeValueAsString(createObjectNode);
        System.out.println(writeValueAsString);

        // JSON转对象
        JsonNode readTree = mapper.readTree(writeValueAsString);
        // path返回的是一个missing node
        JsonNode path = readTree.path("username");
        // JsonNode path = readTree.get("username");//GET 返回的是空
        String textValue = path.textValue();
        int intValue = readTree.path("age").intValue();
        System.out.println(textValue);
        System.out.println(intValue);

        // List, Map等复杂类型转JSON
        ArrayNode node = mapper.createArrayNode();
        for (int i = 0; i < 10; i++) {
            ObjectNode node1 = mapper.createObjectNode();
            node1.put("username", "小丑皇" + i);
            node1.put("age", i);
            node1.put("lover", false);
            node.add(node1);
        }
        String writeValueAsString2 = mapper.writeValueAsString(node);
        System.out.println(mapper.writeValueAsString(node));

        // JSON转List,Map等复杂类型
        JsonNode readTree2 = mapper.readTree(writeValueAsString2);
        Iterator<JsonNode> elements = readTree2.elements();
        for (; elements.hasNext(); ) {
            JsonNode next = elements.next();
            System.out.println(next.path("username").textValue() + "_" + next.path("age").intValue() + "_" + next.path("lover").booleanValue());
        }
    }
}
