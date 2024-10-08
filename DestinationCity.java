import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = List.of(
                List.of("London","New York"),
                List.of("New York","Lima"),
                List.of("Lima","Sao Paulo")
        );


        System.out.println(destCity(paths));
    }
    public static  String destCity(List<List<String>> paths) {

        Set<String> sourceSet = new HashSet();
        for (int i = 0; i < paths.size(); i++) {
        sourceSet.add(paths.get(i).get(0));
    }
        for (int i = 0; i < paths.size(); i++) {
        String destination = paths.get(i).get(1);
        if (!sourceSet.contains(destination)) {
            return destination;
        }
    }
        return "";
}}
