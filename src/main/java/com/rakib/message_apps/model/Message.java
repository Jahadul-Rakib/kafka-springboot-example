package com.rakib.message_apps.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Message implements Serializable {
    private String message;
    private String sender;
    private String receiver;
}
