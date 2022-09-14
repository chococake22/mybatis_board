package com.example.chococake.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class BoardListVo {

    private Long boardIdx;
    private String title;
    private String writer;
    private String type;
    private String content;

}
