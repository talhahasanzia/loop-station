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
        presenter = DefaultHomePresenter(view)
    }

    @Test
    fun init() {
        assertNotNull(view)
    }

    class MockView : HomeView{

    }
}