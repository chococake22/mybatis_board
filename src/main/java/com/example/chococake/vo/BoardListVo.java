package com.example.chococake.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardListVo {

    private Long board_idx;
    private String title;
    private String writer;
    private String type;
    private String content;

}
