function changeMessage() {
    const messages = [
        "Here's to another year of success, happiness, and laughter!",
        "May your day be filled with lots of love and fun!",
        "Cheers to the amazing person you are and all that you've achieved!",
        "May all your wishes come true today and always!",
    ];

    // Randomly pick a message
    const randomMessage = messages[Math.floor(Math.random() * messages.length)];

    // Display the message in the 'message' div
    document.getElementById("message").innerText = randomMessage;
}
