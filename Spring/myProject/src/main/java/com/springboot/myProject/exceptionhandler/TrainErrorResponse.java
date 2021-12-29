package com.springboot.myProject.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

}
