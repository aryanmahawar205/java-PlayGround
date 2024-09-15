// INTERFACES IN JAVA DEAL WITH CONCEPT OF PURE ABSTRACTION
// WE CAN PERFORM MULTIPLE INHERITANCE AS WELL USING INTERFACES

interface MusicalInstrument
{
    public void playMusic();
}

interface Sound
{
    public void listenSound();
}

class Piano implements MusicalInstrument, Sound
{
    public void playMusic()
    {
        System.out.println("Piano playing!");
    }

    public void listenSound()
    {
        System.out.println("Piano keys make chord sounds!");
    }

}

public class Interfaces
{
    public static void main(String[] args)
    {
        Piano piano = new Piano();
        piano.playMusic(); piano.listenSound();
    }
}