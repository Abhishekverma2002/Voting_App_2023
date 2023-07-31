# Voting_App_2023
# Android Voting App 2023

The Android Voting App 2023 is a mobile application that allows users to vote for different political parties. The app utilizes Firebase's Google One tap login functionality for authentication and Firebase Realtime Database to manage and store votes for different parties in real-time.

## Features

- **Google One tap login:** Users can log in to the app using their Google accounts with just one tap, making the login process quick and convenient.
- **Voting Dashboard:** The app provides a user-friendly voting dashboard to display the party list and handle user voting logic.
- **Realtime Vote Updates:** As users vote for different parties, the app updates the vote count in real-time, providing live information about the current voting status.
- **Admin Page:** The app includes an admin page with administrative functionalities to manage the voting process and view voting statistics.
- **Security:** Firebase's authentication ensures that only authorized users can access the voting system, maintaining the integrity of the voting process.

## Tech Stack

- Android (Java)
- Firebase Authentication
- Firebase Realtime Database

## App Structure

The app is organized into several activities:

1. `SplashScreen`: A splash screen that appears when the app starts and introduces the app.
2. `MainActivity`: The main activity that handles user authentication and redirects to the Voting Dashboard or Admin Page based on user roles.
3. `VotingDashboard`: The activity where users can view the party list and cast their votes.
4. `adminPage`: The activity with administrative functionalities for managing the voting process and viewing voting statistics.

## How to Run

1. Clone or download the repository to your local machine.
2. Open the Android project in Android Studio.
3. Build and run the app on an Android emulator or physical device.

## Firebase Configuration

To set up Firebase in the app:

1. Create a new Firebase project at [https://console.firebase.google.com/](https://console.firebase.google.com/).
2. Enable Google authentication in the Firebase Authentication settings.
3. Set up the Realtime Database in Firebase, allowing read and write access as required.
4. Download the `google-services.json` file from the Firebase console and place it in the `app/` directory of the Android project.

## App Implementation

- The `MainActivity` handles user authentication using Google One tap. It redirects to `VotingDashboard` for regular users or `adminPage` for administrators based on their roles.
- The `VotingDashboard` displays the party list using a RecyclerView and allows users to cast their votes.
- The `admin page` provides administrative functionalities for managing the voting process and viewing voting statistics.


## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.

## Acknowledgments

- The app uses Firebase for authentication and real-time database, making the development process faster and more efficient.



---

