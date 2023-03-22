import java.util.ArrayList;

public class Main {
            public static void main(String[] args) {
                ArrayList<String> desertIslandPlaylist = new ArrayList<String>(5);

                desertIslandPlaylist.add("Won't go home without you by Maroon Five");
                desertIslandPlaylist.add("Stutter by Maroon Five");
                desertIslandPlaylist.add("It was always you by Maroon Five");
                desertIslandPlaylist.add("Lost by Maroon Five");
                desertIslandPlaylist.add("Girls like you by Maroon Five");
                desertIslandPlaylist.add("Goodnight Goodnight by Maroon Five");

                System.out.println(desertIslandPlaylist);
                System.out.println(desertIslandPlaylist.size());
                desertIslandPlaylist.remove("It was always you by Maroon Five");
                int indexA = desertIslandPlaylist.indexOf("Stutter by Maroon Five");
                int indexB = desertIslandPlaylist.indexOf("Girls like you by Maroon Five");
                String tempA = "Stutter by Maroon Five";
                desertIslandPlaylist.set(indexA, "Girls like you by Maroon Five");
                desertIslandPlaylist.set(indexB, "Stutter by Maroon Five");

                System.out.println(desertIslandPlaylist);
                System.out.println(desertIslandPlaylist.size());
            }
        }
