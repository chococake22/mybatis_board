package com.example.chococake.service;

import com.example.chococake.domain.Board;
import com.example.chococake.dto.BoardSaveDto;
import com.example.chococake.dto.BoardUpdateDto;
import com.example.chococake.vo.BoardDetailVo;
import com.example.chococake.vo.BoardListVo;

import java.util.List;

public interface BoardService {

    int boardCount();

    List<BoardListVo> getBoardList();

    void insertBoard(BoardSaveDto board);

    BoardDetailVo getBoardDetail(Long boardIdx);

    void updateBoard(BoardUpdateDto board, Long boardIdx);

    void deleteBoard(Long boardIdx);
}
