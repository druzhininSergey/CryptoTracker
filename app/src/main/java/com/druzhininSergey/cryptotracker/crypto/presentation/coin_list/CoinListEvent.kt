package com.druzhininSergey.cryptotracker.crypto.presentation.coin_list

import com.druzhininSergey.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}