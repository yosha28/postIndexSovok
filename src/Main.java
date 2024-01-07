

import java.util.*;
import java.util.stream.Stream;
//  1
// 6 7 2
//  0
// 5 8 3
//  4
//
//[0, 1, 2, 3]
//[0, 1, 2, 8]
//[0, 2, 3, 5]
//[0, 2, 5, 8]

public class Main {


    public static void main(String[] args) {
        List<Integer[]> edgeList = Stream.of(
                new Integer[]{1, 2, 3, 4, 5, 6},
                new Integer[]{7, 2, 3},
                new Integer[]{1, 2, 8, 4},
                new Integer[]{1, 7, 0, 8},
                new Integer[]{6, 0, 2, 3},
                new Integer[]{1, 6, 0, 3, 4},
                new Integer[]{7, 0, 3, 4, 5},
                new Integer[]{1, 7, 5},
                new Integer[]{1, 2, 3, 4, 5, 6, 0},
                new Integer[]{1, 2, 0, 6, 8} ).toList();

        int i, y, z, x;
        for (i = 0; i < 9; i++) {
            for (y = i + 1; y < 9; y++) {
                for (z = y + 1; z < 9; z++) {
                    for (x = z + 1; x < 9; x++) {
                        Map<List<Boolean>, Integer> map = new HashMap<>();
                        List<Integer> numberEdge = Stream.of(i,y,z,x).toList();

                        for (int g = 0; g < 10; g++) {
                            List<Boolean> list = new ArrayList<>();
                            list.add(Arrays.asList(edgeList.get(g)).contains(i));
                            list.add(Arrays.asList(edgeList.get(g)).contains(y));
                            list.add(Arrays.asList(edgeList.get(g)).contains(z));
                            list.add(Arrays.asList(edgeList.get(g)).contains(x));

                            map.put(list, g);

                        }

                        if (map.size() == 10) {
                            System.out.println(numberEdge);
                        }

                    }
                }
            }
        }

    }

}




