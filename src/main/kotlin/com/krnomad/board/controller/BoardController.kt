package com.krnomad.board.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class BoardController {
    @GetMapping("/")
    @ResponseBody
    fun main(): String {
        return "Hello World"
    }

    @GetMapping("/board/write")
    fun boardWriteForm(): String {
        return "boardwrite"
    }
}