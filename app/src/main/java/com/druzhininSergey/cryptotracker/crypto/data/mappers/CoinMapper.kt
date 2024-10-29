package com.druzhininSergey.cryptotracker.crypto.data.mappers

import com.druzhininSergey.cryptotracker.crypto.domain.Coin
import com.druzhininSergey.cryptotracker.crypto.data.networking.dto.CoinDto

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}