package com.example.chococake.service;

import com.example.chococake.domain.Board;
import com.example.chococake.dto.BoardSaveDto;
import com.example.chococake.dto.BoardUpdateDto;
import com.example.chococake.mapper.BoardMapper;
import com.example.chococake.vo.BoardDetailVo;
import com.example.chococake.vo.BoardListVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public int boardCount() {
        return boardMapper.boardCount();
    }

    @Override
    public List<BoardListVo> getBoardList() {
        return boardMapper.findAll();
    }

    @Override
    public void insertBoard(BoardSaveDto board) {
        boardMapper.insertBoard(board);
    }

    @Override
    public BoardDetailVo getBoardDetail(Long boardIdx) {
        return boardMapper.getBoardInfo(boardIdx);
    }

    @Override
    public void updateBoard(BoardUpdateDto board, Long boardIdx) {
        boardMapper.updateBoard(board);
    }

    @Override
    public void deleteBoard(Long boardIdx) {
        boardMapper.deleteBoard(boardIdx);
    }
}
