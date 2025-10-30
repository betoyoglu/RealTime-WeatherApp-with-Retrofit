

🌤️ **Realtime Weather Application (Realtime Weather App)**
----------

This project is a demonstration developed using modern Kotlin and Jetpack Compose, showcasing how to build a clean and scalable Android application. The app retrieves instant weather data for a user-input location from a public weather API (https://www.weatherapi.com/) using Retrofit and displays it beautifully.
## Screenshots

![App Screenshot](<img width="436" height="885" alt="image" src="https://github.com/user-attachments/assets/f3af4647-643d-47c9-ad75-37c6be6edd73" />
)


## Tech Stack

**Language**: Kotlin

**UI Toolkit**: Jetpack Compose (Modern, Declarative UI)

**Data Management**: Jetpack ViewModel & LiveData / State

**Networking**: Retrofit2

**Serialization**: Gson Converter

**Asynchronous Operations**: Kotlin Coroutines


## Lessons Learned

**1. Clean Architecture and Data Management**

*Layered Structure*: Separation of the project into API, UI, and ViewModel layers to ensure scalability and testability.

*ViewModel Usage*: Preparing and managing lifecycle-aware data independently of the UI.

*Unidirectional Data Flow*: Implementing the principle of encapsulation using LiveData and MutableLiveData to safely manage and expose data.

**2. Secure API Integration**

*Retrofit Integration*: Defining network communication via RetrofitInstance and the WeatherAPI interface.

*Model Creation*: Mapping the incoming JSON data to usable data structures using Kotlin's data class (Model).

*Safe State Management*: Utilizing the sealed class structure to handle the three possible states of network operations: Loading, Success, and Error.

**3. Modern UI with Jetpack Compose**

*Declarative UI*: Building a modern and flexible UI with Composable functions instead of traditional XML.

*State-Driven UI*: Observing the weatherResult and dynamically updating the screen based on the incoming NetworkResponse state (e.g., showing an error message, displaying a CircularProgressIndicator for loading).

*User Interface Design*: Implementing a clean design that presents data (Location, Temperature, Wind Speed, Humidity, etc.) in an organized and readable manner.
