package kr.jeje.shopmall.controller;

import kr.jeje.shopmall.dto.BoardDto;
import kr.jeje.shopmall.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String list(Model model){
        List<BoardDto> boardDtoList = boardService.getBoardList();
        model.addAttribute("postList", boardDtoList); //boardDtoList를 board/list.html에 전달
        return "board/list.html";
    }

    @GetMapping("/post")
    public String post(){
        return "board/post.html";
    }

    @PostMapping("/post")
    public String write(BoardDto boardDto){
        boardService.savePost(boardDto);
        return "redirect:/";
    }
}
