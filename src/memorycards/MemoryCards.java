package memorycards;

/**
 *
 * @author Caslav
 */
public class MemoryCards {
    
    public static void main(String[] args) {
        
        Entry e = new Entry();
        e.setLocationRelativeTo(null);
        e.setVisible(true);
        
        String filepath = "music\\\\Chad_Crouch_-_Algorithms.wav";
        Music musicObject = new Music();
        musicObject.playMusic(filepath);
    }
    
}
