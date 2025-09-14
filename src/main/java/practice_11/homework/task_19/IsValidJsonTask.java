package practice_11.homework.task_19;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IsValidJsonTask {
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
