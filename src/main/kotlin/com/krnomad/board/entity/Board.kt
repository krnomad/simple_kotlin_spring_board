package com.krnomad.board.entity

import javax.persistence.*

@Entity
open class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
    open lateinit var title: String
    open lateinit var content: String
}