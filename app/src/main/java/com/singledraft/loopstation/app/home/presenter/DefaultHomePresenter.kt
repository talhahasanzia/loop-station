package com.singledraft.loopstation.app.home.presenter

import com.singledraft.loopstation.app.home.contracts.HomeInteractor
import com.singledraft.loopstation.app.home.contracts.HomeInteractorOut
import com.singledraft.loopstation.app.home.contracts.HomePresenter
import com.singledraft.loopstation.app.home.contracts.HomeView

class DefaultHomePresenter(view: HomeView) : HomePresenter, HomeInteractorOut {

    private lateinit var interactor : HomeInteractor

    fun init() {

    }
}