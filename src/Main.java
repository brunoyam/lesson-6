import java.util.*;

public class Main {


    static void wordsCountInString() {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] words = s.split(" ");

        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String w : words) {   // бежим по всем словам в исходном предложении
            if (wordsCount.containsKey(w)) {  // если в нашем счетчике уже есть такое слово, то нужно увеличить старый счетчик
                int tmp = wordsCount.get(w);  // достаем старый счетчик
                tmp++; // увелиичваем старый счетчик на 1
                wordsCount.put(w, tmp);   // кладем новый счетчик
            } else {
                wordsCount.put(w, 1);   // если в нашем счтечике еще не было такого слова, то мы просто сохраняем, что слово было 1 раз
            }
        }

        Set<String> keys = wordsCount.keySet();  // получаем уникаьлное множество ключей данной мапы
        for (String key : keys) {
            System.out.println(key + " = " + wordsCount.get(key));
        }
    }


    static void fun() {
        ArrayList<Integer> integers = new ArrayList<>(1000);   // можно сразу задать размер внутреннего массива
        ArrayList<String> strings = new ArrayList<>();

        // ArrayList<Cat> cats = new ArrayList<Cat>();      -- можно создавать списки любого типа


        integers.add(1);   // добавить элемент в массив
        integers.add(56);
        integers.add(100);

        for (int i = 0; i < integers.size(); ++i) {    // цикл для просмотра всех элементов
            System.out.println(integers.get(i));   // .get(i) - получить элемент по индексу
        }

        boolean thereIsOneInArray = integers.contains(1);   // проверка, есть ли 1 в массиве
        System.out.println(thereIsOneInArray);

        integers.remove(new Integer(1));    // удалить элемент из списка - здесь удаляем ОБЪЕКТ
        integers.remove(1);   // удалить элемент по индексу   - данный коллапс возникает только тогда, когда в списке целые числа

        System.out.println(integers.contains(1));
        System.out.println(integers.contains(100));


        /*
        int[] a = {5, 6, 12, 68, 1234};
        List<Integer> anotherIntegers = Arrays.asList(a));
        integers.addAll(anotherIntegers);

        for (int i = 0; i < integers.size(); ++i) {
            System.out.println(integers.get(i));
        }*/

        System.out.println("____________________________");
        System.out.println("____________________________");

        strings.add("abacaba");
        strings.add("lalala");
        strings.add("Tom");
        strings.add("Jeeerry");

        for (String s : strings) {   // FOREACH цикл
            System.out.println(s);
        }


        System.out.println("____________________________");
        System.out.println("____________________________");
        Iterator<String> it = strings.iterator();   // итератор
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        strings.stream().forEach(System.out::println);  // java 8 1-line print


        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(1);  // бессмысленно добавлять повторно элемент в множество
        integerHashSet.add(-1);
        integerHashSet.add(100);

        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(5);
        integerTreeSet.add(-1);
        integerTreeSet.add(500);
        integerTreeSet.add(45);
        integerTreeSet.add(20);


        System.out.println("____________________________");
        System.out.println("____________________________");
        Iterator<Integer> it2 = integerTreeSet.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());   // выведутся в отсортированном порядке, так как TreeMap - отсортированное дерево поиска
        }
    }

    public static void main(String[] args) {
        wordsCountInString();
    }
}
