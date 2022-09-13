package com.example.chococake.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter // setter가 있어야 ModelAttibute를 통해서 controller에서 데이터를 받고 넘기는 게 가능하다.
public class BoardSaveDto {

    private Long board_idx;
    private String title;
    private String writer;
    private String type;
    private String content;

}
