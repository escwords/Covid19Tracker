package com.jaimegc.covid19tracker.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jaimegc.covid19tracker.common.extensions.millisecondsToDate
import com.jaimegc.covid19tracker.domain.model.DomainError
import com.jaimegc.covid19tracker.domain.states.StateError
import com.jaimegc.covid19tracker.domain.usecase.GetCovidTracker
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class MainViewModel(
    private val getCovidTracker: GetCovidTracker
) : ViewModel() {

    fun getCovidTracker() =
        viewModelScope.launch {
            getCovidTracker.getCovidTrackerByDate(
                System.currentTimeMillis().millisecondsToDate()).collect { result ->
                    result.mapLeft { handleError(it) }
            }
        }

    private fun handleError(state: StateError<DomainError>) {
        // Not implemented
    }
}