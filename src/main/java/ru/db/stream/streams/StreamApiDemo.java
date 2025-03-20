package ru.db.stream.streams;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) throws Exception {
//        demonstrateJoining();
//        demonstrateParallel();
//        demonstrateMap();
//        demonstrateFlatMap();
//        demonstrateDistinct();
        demonstrateSorted();
//        demonstratePeek();
//        demonstrateStreamOf();
//        demonstrateStreamIterate();
//        demonstrateStreamGenerate();
//        demonstrateStreamBuilder();
//        demonstrateGroupingBy();
//        demonstratePartitioningBy();
//        demonstrateJsonStream();
    }

    private static void demonstrateJoining() {
        List<String> fruits = List.of("Apple", "Banana", "Cherry");

        String result = fruits.stream()
                .collect(Collectors.joining(", ", "", "")); // [Apple, Banana, Cherry]

        System.out.println("\njoining() example: " + result);
    }

    private static void demonstrateParallel() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        long count = numbers.parallelStream() // Параллельная обработка
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("\nparallel() example: Even numbers count = " + count);
    }

    private static void demonstrateMap() {
        List<String> words = List.of("Java!", "Stream!", "API!");

        List<String> lengths = words.stream()
                .map(String::toUpperCase) // Преобразуем строки в их длины
                .toList();

        System.out.println("\nmap() example: " + lengths); // [4, 6, 3]
    }

    private static void demonstrateFlatMap() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        List<Integer> flatList = matrix.stream()
                .flatMap(List::stream) // "Сглаживаем" вложенные списки
                .toList();

        System.out.println("\nflatMap() example: " + flatList); // [1, 2, 3, 4]
    }

    private static void demonstrateDistinct() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3);

        List<Integer> unique = numbers.stream()
                .distinct() // Удаляем дубликаты
                .toList();

        System.out.println("\ndistinct() example: " + unique); // [1, 2, 3]
    }

    private static void demonstrateSorted() {
        List<String> names = List.of("Zoe", "Alice", "Bob");

        List<String> sortedNames = names.stream()
                .sorted() // Сортировка по алфавиту
                .toList();

        System.out.println("\nsorted() example: " + sortedNames); // [Alice, Bob, Zoe]
    }

    private static void demonstratePeek() {
        List<Integer> numbers = List.of(1, 2, 3);

        List<Integer> result = numbers.stream()
                .peek(n -> System.out.println("Processing: " + n)) // Логирование
                .map(n -> n * 2)
                .toList();

        System.out.println("\npeek() example: " + result); // [2, 4, 6]
    }

    private static void demonstrateStreamOf() {
        Stream<String> stream = Stream.of("A", "B", "C");
        System.out.println("\nStream.of() example:");
        stream.forEach(x -> System.out.println(x)); // A B C
    }

    private static void demonstrateStreamIterate() {
        System.out.println("\nStream.iterate() example:");
        Stream.iterate(0, n -> n + 2)
                .limit(5) // Ограничиваем бесконечный поток
                .forEach(n -> System.out.print(n + " ")); // 0 2 4 6 8
    }

    private static void demonstrateStreamGenerate() {
        Supplier<Double> randomSupplier = Math::random;

        System.out.println("\nStream.generate() example:");
        Stream.generate(randomSupplier)
                .limit(3)
                .forEach(System.out::println); // Пример: 0.42, 0.87, 0.15
    }

    private static void demonstrateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.add("One").add("Two").add("Three");

        System.out.println("\nStream.Builder example:");
        builder.build().forEach(System.out::println); // One Two Three
    }

    private static void demonstrateGroupingBy() {
        List<String> words = List.of("apple", "banana", "cherry");

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("\ngroupingBy() example: " + groupedByLength);
        // {5=[apple], 6=[banana, cherry]}
    }

    private static void demonstratePartitioningBy() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("\npartitioningBy() example: " + partitioned);
        // {false=[1, 3, 5], true=[2, 4]}
    }

    private static void demonstrateJsonStream() throws Exception {
        String json = "[{\"name\":\"Alice\"}, {\"name\":\"Bob\"}]";
        ObjectMapper mapper = new ObjectMapper();

        List<Map<String, String>> data = mapper.readValue(json, new TypeReference<>() {
        });
        List<String> names = data.stream()
                .map(entry -> entry.get("name"))
                .toList();

        System.out.println("\nStream from JSON example: " + names); // [Alice, Bob]
    }

    // demonstrateXmlStream();
//    private static void demonstrateXmlStream() throws Exception {
//        String xml = "<names><name>Alice</name><name>Bob</name></names>";
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//        Document doc = builder.parse(new InputSource(new StringReader(xml)));
//
//        NodeList nodeList = doc.getElementsByTagName("name");
//        List<String> names = IntStream.range(0, nodeList.getLength())
//                .mapToObj(nodeList::item)
//                .map(Node::getTextContent)
//                .toList();
//
//        System.out.println("\nStream from XML example: " + names); // [Alice, Bob]
//    }

}
