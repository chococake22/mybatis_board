package com.example.chococake.controller;

import com.example.chococake.domain.Board;
import com.example.chococake.dto.BoardSaveDto;
import com.example.chococake.dto.BoardUpdateDto;
import com.example.chococake.service.BoardServiceImpl;
import com.example.chococake.vo.BoardDetailVo;
import com.example.chococake.vo.BoardListVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardServiceImpl boardService;

    @GetMapping("/")
    public String getBoard(Model model) {

        List<BoardListVo> boards = boardService.getBoardList();

        model.addAttribute("boards", boards);
        model.addAttribute("count", boardService.boardCount());

        return "index";
    }

    @PostMapping("/board/save")
    public String saveBoard(BoardSaveDto board) {
        boardService.insertBoard(board);
        return "redirect:/";
    }

    @GetMapping("/board/detail")
    public String detailBoard(Model model, @RequestParam Long board_idx) {
        BoardDetailVo board = boardService.getBoardDetail(board_idx);
        model.addAttribute("board", board);
        return "/board/detail";
    }

    @GetMapping("/board/update")
    public String updateBoard(Model model, @RequestParam Long board_idx) {
        BoardDetailVo board = boardService.getBoardDetail(board_idx);
        model.addAttribute("board", board);
        return "/board/update";
    }

    @PostMapping ("/board/update/check")
    public String updateBoardChk(Model model, @RequestParam Long board_idx, BoardUpdateDto board) {
        boardService.getBoardDetail(board_idx);
        boardService.updateBoard(board, board_idx);
        return "redirect:/";
    }

    @GetMapping("/board/delete")
    public String deleteBoard(@RequestParam Long board_idx) {
        boardService.deleteBoard(board_idx);
        return "redirect:/";
    }
}
