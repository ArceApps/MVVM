package com.example.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.model.QuoteModel
import com.example.mvvm.model.QuoteProvider

/**
 * Created by Oscar Arce
 * on 30/09/2022.
 */
class QuoteViewModel : ViewModel() {
    val quoteViewModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuoteViewModel: QuoteModel = QuoteProvider.random()
        quoteViewModel.postValue(currentQuoteViewModel)
    }
}