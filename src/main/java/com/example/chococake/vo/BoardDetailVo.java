package com.example.chococake.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class BoardDetailVo {

    private Long boardIdx;
    private String title;
    private String writer;
    private String type;
    private String content;

}
