package com.example.chococake.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class BoardUpdateDto {

    private Long board_idx;
    private String title;
    private String writer;
    private String type;
    private String content;

}
