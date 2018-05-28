import java.util.ArrayList;
import java.util.List;

public class NearbyElements {

    int[][] multi;

    public NearbyElements() {
        multi = new int[][]{
                { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
                { 1, 3, 5, 7 },
                { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
        };
    }

    public int[] returnNearbyElements(int x, int y, int range) {
        List<Integer> neerbyElementsTmp = new ArrayList<>();
        int[] nearbyElements;

        for (int i = y - range; i <= y + range; i++) {
                if ((i != y ) && (i > -1) && (i < multi[x].length)) {
                    neerbyElementsTmp.add(multi[x][i]);
                }
        }

        nearbyElements = new int[neerbyElementsTmp.size()];
        for (int i = 0; i < nearbyElements.length; i++) {
            nearbyElements[i] = neerbyElementsTmp.get(i);
        }

        return nearbyElements;
    }

    public void printNearbyElements(int[] neerbyElements) {
        for (int i = 0; i < neerbyElements.length; i++) {
            System.out.print(neerbyElements[i] + ",");
        }
        System.out.println();
    }
}
