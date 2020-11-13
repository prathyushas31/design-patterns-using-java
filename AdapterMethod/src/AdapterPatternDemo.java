public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();

      audioPlayer.play("mp3", "prathyu.mp3");
      audioPlayer.play("mp4", "susmi.mp4");
      audioPlayer.play("vlc", "sagar.vlc");
      audioPlayer.play("avi", "saila.avi");
   }
}
