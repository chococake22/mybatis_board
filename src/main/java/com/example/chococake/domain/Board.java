package com.example.chococake.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    private Long boardIdx;
    private String title;
    private String writer;
    private String type;
    private String content;
}
