package com.druzhininSergey.cryptotracker.crypto.domain

import com.druzhininSergey.cryptotracker.core.domain.util.NetworkError
import com.druzhininSergey.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}