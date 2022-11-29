package com.krnomad.board.service

import com.krnomad.board.entity.Board
import com.krnomad.board.repository.BoardRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardService {
    @Autowired
    lateinit var boardRepository: BoardRepository

    fun write(board: Board) {
        boardRepository.save(board)
    }
}