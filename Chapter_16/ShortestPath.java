/**
 * ShortestPath
 */
public class ShortestPath {
    public static float shortestPath(String path) {
        int x = 0, y = 0;
        char ch;
        for (int i = 0; i < path.length(); i++) {
            ch = path.charAt(i);
            switch (ch) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }
        return (float)(Math.sqrt(x*x+y*y));
    }

    public static void main(String[] args) {
           String path="WNEENESENNN";
           System.out.println(shortestPath(path));
    }
}