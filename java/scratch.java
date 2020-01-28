import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Scratch {
    public static void main(String[] args) {

//        System.out.println(greeting(null));
//        System.out.println(greeting("username"));
//        System.out.println(greeting1(null));
//        System.out.println(greeting1("username"));

        List<Integer> integerList = IntStream.range(3, 6).boxed().collect(Collectors.toList());
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(11);
        integerList1.add(1);
        integerList1.add(3);
        integerList1.add(5);


        System.out.println(streamCheck1(integerList));
        System.out.println(streamCheck1(integerList1));

        System.out.println(streamCheckGetsBooleanValue(integerList));
        System.out.println(streamCheckGetsBooleanValue(integerList1));

        System.out.println(streamCheckGetsBooleanValueUsingAnyMatch(integerList));
        System.out.println(streamCheckGetsBooleanValueUsingAnyMatch(integerList1));

        integerList1.add(6);
        System.out.println();
        System.out.println();

        System.out.println("After adding 6 to Second list");
        System.out.println(streamCheck1(integerList));
        System.out.println(streamCheck1(integerList1));

        System.out.println(streamCheckGetsBooleanValue(integerList));
        System.out.println(streamCheckGetsBooleanValue(integerList1));
        System.out.println(streamCheckGetsBooleanValueUsingAnyMatch(integerList));
        System.out.println(streamCheckGetsBooleanValueUsingAnyMatch(integerList1));


        Map<String, String> map = new HashMap<>();
        System.out.println("Map Check" + map.containsKey("hi"));


        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        stringSet.add("four");
        stringSet.add("five");
        stringSet.add("six");
        stringSet.add("seven");
        stringSet.add("eight");
        stringSet.add("nine");
        stringSet.add("ten");


        isSkuExcluded(stringSet);
        return;
    }

    private static Integer streamCheck1(List<Integer> integerList) {

        return integerList
                .stream()
                .map(value -> value * 3)
                .filter(s -> s % 2 == 0)
                .findFirst()
                .orElse(-1);
    }

    private static boolean streamCheckGetsBooleanValue(List<Integer> integerList) {

        return integerList
                .stream()
                .map(value -> value * 3)
                .filter(s -> s % 2 == 0)
                .findFirst()
                .isPresent();
    }

    private static boolean streamCheckGetsBooleanValueUsingAnyMatch(List<Integer> integerList) {

        return integerList
                .stream()
                .map(value -> value * 3)
                .anyMatch(s -> s % 2 == 0)
                ;
    }

    public static String greeting(String userName) {
        String g;
        if (userName == null) {
            g = "Please log in";
        } else {
            g = "Hello " + userName;
        }
        return g;
    }

    public static String greeting1(String userName) {
        return Optional.ofNullable(userName)
                .map(s -> "Hello " + s)
                .orElse("Please log in");
    }

    private static void isSkuExcluded(Set<String> stringSet) {
        Set<String> anotherStringSet = new HashSet<>();
        anotherStringSet.add("one");
        anotherStringSet.add("two");
        anotherStringSet.add("three");
        anotherStringSet.add("four");
        anotherStringSet.add("five");
        anotherStringSet.add("six");
        anotherStringSet.add("seven");
        anotherStringSet.add("eight");
        anotherStringSet.add("nine");
        anotherStringSet.add("ten");

//        for(String s : stringSet) {
//            if(s.equals("ten")) {
//                if(productSku.getAttributeValueMap().get(s).getStringValue().equals("true")) {
//                    return true;
//                }
//            }
//        }
//
//        return something.method("parameter");

//        https://stackoverflow.com/a/32704965/6628723

        stringSet.stream()
                .filter(input -> input.equals("nine"))
                .filter(filteredInput -> anotherStringSet.contains(filteredInput))
                .findAny()
//                .ifPresent()
                    .map(p -> {
            return true;
        }).orElseGet(() -> {
            return true && true && true;
        });
        ;
    }
}