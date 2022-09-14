package com.example.chococake.mapper;

import com.example.chococake.domain.Board;
import com.example.chococake.dto.BoardSaveDto;
import com.example.chococake.dto.BoardUpdateDto;
import com.example.chococake.vo.BoardDetailVo;
import com.example.chococake.vo.BoardListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BoardMapper {

    int boardCount();

    List<BoardListVo> findAll();

    void insertBoard(BoardSaveDto board);

    BoardDetailVo getBoardInfo(Long boardIdx);

    void deleteBoard(Long boardIdx);

    void updateBoard(BoardUpdateDto board);

    Board getBoard(Long boardIdx);
}
