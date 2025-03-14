# CryptoTracker
Mobile application for tracking cryptocurrency dynamics in real-time on the Android platform.

## Project Description
CryptoTracker is a modern Android application that allows users to track current rates of popular cryptocurrencies, view price history on charts, and receive up-to-date information about the cryptocurrency market.

## Key Features
- Display list of popular cryptocurrencies with current prices
- Detailed information about selected cryptocurrency
- Interactive price change charts
- Adaptive design optimized for various screen sizes

## Technology Stack

**Programming Language**:
- Kotlin
  
**UI**:
- Jetpack Compose with Material 3
  
**Architecture**:
- Clean Architecture + MVVM
  
**Dependency Injection**:
- Koin
  
**Networking**:
- Ktor Client
  
**Asynchronous Programming**:
- Coroutines + Flow
  
**Adaptive Design**:
- Material 3 Adaptive Navigation

## Application Architecture

The project is organized according to Clean Architecture principles and divided into the following layers:

### Application Layers

1. **Presentation** (`crypto/presentation`) - user interface layer
    - `coin_list` - cryptocurrency list screen
    - `coin_detail` - detailed cryptocurrency information screen
    - `models` - UI data models

2. **Domain** (`crypto/domain`) - business logic and domain models
    - `Coin.kt` - main cryptocurrency domain model
    - `CoinPrice.kt` - cryptocurrency price model
    - `CoinDataSource.kt` - data source interface

3. **Data** (`crypto/data`) - data layer
    - `networking` - network operations
    - `dto` - data transfer objects
    - `mappers` - mapping DTOs to domain models

### Common Components

- **Core** (`core`) - common components used throughout the application
    - `data/networking` - network utilities
    - `domain/util` - request results and error handling
    - `navigation` - adaptive navigation setup
    - `presentation/util` - UI helper components

## Navigation

The application uses adaptive navigation with `AdaptiveCoinListDetailPane`, which automatically adapts to different screen sizes:
- On phones - navigation between screens
- On tablets and foldable devices - two-panel display mode

## Implementation Features

1. **MVI Elements**
    - Using `CoinListAction`, `CoinListEvent`, and `CoinListState` classes for predictable state management

2. **Error Handling**
    - Type-safe error handling with `Result`, `Error`, and `NetworkError` classes

3. **Component-Based UI**
    - UI separation into reusable components: `InfoCard`, `CoinListItem`, `LineChart`

4. **Interactive Charts**
    - Custom chart implementation using Jetpack Compose Canvas API

## Requirements
- Android 9.0 (API level 28) or higher
- Internet connection for receiving up-to-date data
