package org.example.jsonToObject.jsonObjClasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class JsonObject {
    @JsonProperty("serviceName")
    private String serviceName;
    @JsonProperty("code")
    private int code;
    @JsonProperty("userMessage")
    private String userMessage;
    @JsonProperty("isError")
    private boolean isError;
    private SupportContact[] supportContacts;
    public JsonObject() {
    }
    @Override
    public String toString() {
        return "JsonObject{" + '\n' +
                " serviceName='" + serviceName + '\n' +
                " code=" + code + '\n' +
                " userMessage='" + userMessage + '\n' +
                " isError=" + isError + '\n' +
                " supportContacts=" + Arrays.toString(supportContacts) +'\n' +
                '}';
    }


    @Getter
    @Setter
    private static class SupportContact {
        @JsonProperty("id")
        private int id;
        @JsonProperty("phone")
        private String phone;
        @JsonProperty("email")
        private String email;

        @Override
        public String toString() {
            return "SupportContact{\n" +
                    "\t id=" + id + '\n' +
                    "\t phone='" + phone + '\n' +
                    "\t email='" + email + '\n' +
                    '}';
        }
    }
}
