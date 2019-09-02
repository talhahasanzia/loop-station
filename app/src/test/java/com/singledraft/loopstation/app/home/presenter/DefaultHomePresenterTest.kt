package com.singledraft.loopstation.app.home.presenter

import com.singledraft.loopstation.app.home.contracts.HomeView
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DefaultHomePresenterTest {

    private lateinit var presenter: DefaultHomePresenter

    private lateinit var view : MockView

    @Before
    fun setUp() {
        view = MockView()
        presenter = DefaultHomePresenter(view)
    }

    @Test
    fun init() {

    }

    class MockView : HomeView
}