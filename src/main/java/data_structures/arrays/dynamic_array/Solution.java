package data_structures.arrays.dynamic_array;

/**
 * @author mali.sahin
 * @since 4/26/19.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dynamicArray function below.

    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> results = new ArrayList<>();
        int lastAnswer = 0;

        List<List<Integer>> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp.add(new ArrayList<>());
        }
        for (List<Integer> query : queries) {
            int x = query.get(1);
            int y = query.get(2);
            int index = (x ^ lastAnswer) % n;
            if (query.get(0) == 1) {
                temp.get(index).add(y);
            } else if (query.get(0) == 2) {
                List<Integer> seq = temp.get(index);
                lastAnswer = temp.get(index).get(y % seq.size());
                results.add(lastAnswer);
            }
        }

        return results;
    }

    public static void main(String[] args) throws IOException {


        List<List<Integer>> matrix = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(1, 345255357, 205970905),
                        Arrays.asList(1, 570256166, 75865401
                        ), Arrays.asList(1, 94777800, 645102173
                        ), Arrays.asList(1, 227496730, 16649450
                        ), Arrays.asList(1, 82987157, 486734305
                        ), Arrays.asList(1, 917920354, 757848208),
                        Arrays.asList(1, 61379773, 817694251
                        ), Arrays.asList(1, 330547128, 112869154),
                        Arrays.asList(1, 328743001, 855677723),
                        Arrays.asList(1, 407951306, 669798718),
                        Arrays.asList(1, 21506172, 676980108
                        ), Arrays.asList(1, 49911390, 342109400
                        ), Arrays.asList(1, 980306253, 305632965),
                        Arrays.asList(2, 736380701, 402184046),
                        Arrays.asList(2, 798108301, 416334323),
                        Arrays.asList(1, 254839279, 1370035
                        ), Arrays.asList(1, 109701362, 2800586
                        ), Arrays.asList(1, 374257441, 165208824),
                        Arrays.asList(1, 624259835, 477431250),
                        Arrays.asList(1, 629066664, 454406245),
                        Arrays.asList(1, 135821145, 763845832),
                        Arrays.asList(1, 480298791, 138234911),
                        Arrays.asList(1, 553575409, 835718837),
                        Arrays.asList(1, 13022848, 624652920
                        ), Arrays.asList(1, 974893519, 882630870),
                        Arrays.asList(1, 137832930, 216177975),
                        Arrays.asList(1, 453349691, 969255659),
                        Arrays.asList(1, 138396076, 91038209
                        ), Arrays.asList(1, 699822497, 941751038),
                        Arrays.asList(1, 116800806, 64071662
                        ), Arrays.asList(1, 815273934, 8835809), Arrays.asList(1, 658534867, 657771609),
                        Arrays.asList(1, 183760807, 179377441),
                        Arrays.asList(1, 93984556, 636425656
                        ), Arrays.asList(1, 231506463, 836238924),
                        Arrays.asList(1, 214074594, 709571211),
                        Arrays.asList(1, 649641434, 509698468),
                        Arrays.asList(2, 523656673, 709717705),
                        Arrays.asList(2, 261443586, 330808140),
                        Arrays.asList(1, 75924023, 449768243
                        ), Arrays.asList(1, 849537714, 354568873),
                        Arrays.asList(2, 641743742, 124196560),
                        Arrays.asList(1, 19829224, 995759639
                        ), Arrays.asList(1, 244389335, 108315212),
                        Arrays.asList(1, 877758467, 421383626),
                        Arrays.asList(1, 573278148, 474192994),
                        Arrays.asList(2, 561031511, 448889978),
                        Arrays.asList(1, 773294404, 980994962),
                        Arrays.asList(2, 33088709, 716646168
                        ), Arrays.asList(1, 760927835, 441983538),
                        Arrays.asList(1, 273540687, 783321829),
                        Arrays.asList(1, 5933845, 384358662),
                        Arrays.asList(1, 543628702, 372160176),
                        Arrays.asList(2, 136400466, 910559291),
                        Arrays.asList(2, 546568738, 393221347),
                        Arrays.asList(1, 812227065, 694221123),
                        Arrays.asList(1, 311065574, 103905420),
                        Arrays.asList(2, 571344361, 185289590),
                        Arrays.asList(1, 99638520, 173318136
                        ), Arrays.asList(1, 854060080, 407068012),
                        Arrays.asList(2, 980658213, 778573744),
                        Arrays.asList(2, 412539660, 476853104),
                        Arrays.asList(1, 530145366, 36493537
                        ), Arrays.asList(1, 604875364, 100141497),
                        Arrays.asList(2, 650812104, 64817757
                        ), Arrays.asList(1, 141060009, 766603553),
                        Arrays.asList(1, 598398952, 418245941),
                        Arrays.asList(1, 262344011, 431865586),
                        Arrays.asList(2, 56413893, 546484833
                        ), Arrays.asList(1, 400736735, 673588153),
                        Arrays.asList(1, 642955232, 803851098),
                        Arrays.asList(1, 917782037, 935143105),
                        Arrays.asList(1, 658284524, 745224102),
                        Arrays.asList(1, 103202288, 501551287),
                        Arrays.asList(1, 162144918, 12888783),
                        Arrays.asList(1, 16486753, 67467208),
                        Arrays.asList(1, 671120703, 941541277),
                        Arrays.asList(1, 47399694, 77707668
                        ), Arrays.asList(1, 122011395, 946116527),
                        Arrays.asList(1, 924363862, 886726236),
                        Arrays.asList(2, 657761235, 540240467),
                        Arrays.asList(1, 203175991, 279882007),
                        Arrays.asList(2, 304620923, 162838413),
                        Arrays.asList(1, 440453449, 117964712),
                        Arrays.asList(2, 941868853, 887850334),
                        Arrays.asList(1, 293198923, 466812643),
                        Arrays.asList(1, 461688477, 532794906),
                        Arrays.asList(1, 315016797, 733095902),
                        Arrays.asList(1, 265008751, 913972757),
                        Arrays.asList(1, 887405255, 139170948),
                        Arrays.asList(2, 754223230, 426836947),
                        Arrays.asList(1, 945967814, 852589735),
                        Arrays.asList(1, 168866283, 309720694),
                        Arrays.asList(1, 373861145, 94596540
                        ), Arrays.asList(2, 984122495, 20702849
                        ), Arrays.asList(2, 233835636, 180460242),
                        Arrays.asList(1, 172787631, 643823473),
                        Arrays.asList(1, 273611372, 616819555),
                        Arrays.asList(1, 527554061, 434103342),
                        Arrays.asList(1, 196104599, 690080895)
                ));

        List<Integer> results = dynamicArray(100, matrix);
        results.forEach(System.out::println);
    }
}

