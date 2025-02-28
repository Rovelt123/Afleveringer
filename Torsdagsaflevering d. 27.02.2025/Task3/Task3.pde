String []artists = {
  "Ne-Yo",
  "Pitbull",
  "Mario",
  "Akon",
  "USHER"
};

String []songs = {
 "So sick",
 "FIREBAlL",
 "Let me love you",
 "Don't Matter",
 "U Remind Me",
};

void setup() {
  for (int i = 0; i < artists.length; i++) {
    println(i+1 + ". " + artists[i] + ": " + songs[i]);
  }
}
