# Message Receiver

An Android application built to parse OTP (One-Time Password) messages in the background and send the extracted data to a specified client. This project is designed to streamline OTP retrieval and forwarding for automated processes or external services.

## Features

- **Automatic OTP Detection:** Monitors SMS messages for OTP codes without requiring user interaction.
- **Background Service:** Runs a background service to capture OTPs even when the app is not in the foreground.
- **Client Communication:** Forwards the parsed OTP to an external client or server as specified.
- **Efficient Parsing:** Uses regex or other techniques to accurately extract OTPs from incoming SMS messages.

## Screenshots

_Add relevant screenshots here to showcase the app's functionality._

## Prerequisites

- Android Studio installed on your machine.
- An Android device or emulator to test the application.
- A client service or API endpoint to receive the parsed OTP.

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/ilokeshmeena/Message-Reciever.git
```

### Build and Run the App

1. Open the project in Android Studio.
2. Sync the Gradle files.
3. Run the app on an emulator or a physical device with the required permissions to read SMS messages.

### Permissions

To read SMS messages, the following permission needs to be declared in your `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.RECEIVE_SMS"/>
<uses-permission android:name="android.permission.READ_SMS"/>
```

You'll also need to handle runtime permission requests if targeting Android 6.0 (API level 23) or higher.

## Configuration

To send OTP to a client, you can configure the URL or other client parameters inside the app. Modify the `ClientService.java` or `MainActivity.java` to define how and where the OTP should be sent:

```java
String clientUrl = "https://your-client-endpoint.com";
```

### Sending OTP

After parsing the OTP from the SMS, the app will make an HTTP request (or other protocol) to send the OTP to your specified client. The request structure can be modified to meet your client’s requirements.

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests to enhance the app’s functionality.

## Contact

If you have any questions or need further assistance, feel free to reach out via [GitHub Issues](https://github.com/ilokeshmeena/Message-Reciever/issues).
