package Strings;

public class Shildt_Strings {
    public static void main(String[] args) {
        char[] chars = {'1', 'a', 'z', 'f', '3'};
        String str = new String(chars, 1, 3);
        System.out.println(str);
        System.out.println(new String(str));

        byte[] ascii = {65, 66, 67, 68, 69, 70};
        String strAscii = new String(ascii, 2, 2);
        System.out.println(strAscii);
        System.out.println("Длина предыдущей строки: " + strAscii.length());
////////////////////////////////Строковые литералы//////////////////////////////////////
        System.out.println("Literal".toUpperCase());
////////////////////////////////Сцепление строк//////////////////////////////////////
        String age = "7";
        String s = "Ему" + age + "лет, и он одинок";
        System.out.println(s);
////////////////////////Сцепление строк с другими типами данных///////////////////////
        System.out.println("Четыре: " + (2 + 2));
/////////////////////Преобразование символьных строк и метод .toString()///////////////////
        // Метод valueOf() - отвечает за преобразование примитивных типов данных в их стрококвое представление
        // Метод toString() - отвеает за представление объектов в их строковй эквивалент.
        TestBox newBox = new TestBox(10, 12, 14);
        String strBox = "Объект newBox типа Box: " + newBox;
        System.out.println(newBox);
        System.out.println(strBox);
/////////////////////Извлечение символов///////////////////////
        char ch = "12345".charAt(2);
        System.out.println("Третий символ в строке 12345: " + ch);
        char[] Ololo = new char[10];
        "123456789".getChars(4, 8, Ololo, 0);
        System.out.print("Вырезаный массив символов из строки 123456789: ");
        System.out.print(Ololo);
        System.out.println("");
        byte[] Hav = "l234".getBytes();
        System.out.print("Второй байт строки 1234: ");
        System.out.print(Hav[1]);
        System.out.println(" ");
        char[] CharFrom = "4321".toCharArray();
        System.out.println("Первый символ строки 4321: " + CharFrom[0]);
/////////////////////Сравнение символьных строк///////////////////////
        if ("1234".equals("1234")) System.out.println("Строки 1234 и 1234 равны");
        if ("12AAA34".equalsIgnoreCase("12aaa34"))
            System.out.println("Строки 12AAA34 и 12ааа34 равны независимо от регистра");
        if ("a1234|B1234".regionMatches(true, 0, "A1234", 0, 4))
            System.out.println("Строка a1234|B1234, содержит в себе строку A1234, без учета регистра");
        if ("1234".startsWith("23", 1) && "1234".endsWith("34"))
            System.out.println("Строка 1234 со смещением в 1 символ, начинается со строки 23, и заканчивается строкой 34");
/////////////////////Метод equals() в сравнении с операцией ==///////////////////////
        // equals() сравнивает символы из объекта String
        // == сравнивает две ссылки на объекты и определяет, ссылаются ли они на один и тот же экземпляр.
        String s1 = "Dno";
        String s2 = new String(s1);
        if (s1.equals(s2)) System.out.println("Dno equals Dno");
        if (!(s1 == s2)) System.out.println("s1 с Dno != s2 с Dno");
/////////////////////compareTo() и интерфейс Comparable<T>///////////////////////
        // функция int compareTo(String строка) из интерфейса Comparable<T>
        // функция int compareToIgnoreCase(String строка) - без учета регистра
        String[] arrtoSort = {"abc", "bcd", "zz", "xxx", "321"};
        if (arrtoSort[2].compareTo(arrtoSort[0]) > 0) System.out.println("Строка zz больше строки abc");
        if (arrtoSort[0].compareTo(arrtoSort[0]) == 0) System.out.println("Строка zz равна строке zz");
        if (arrtoSort[0].compareTo(arrtoSort[1]) < 0) System.out.println("Строка bcd меньше строки abc");
/////////////////////Поиск в символьных строках///////////////////////
        // Метод indexOf() - находит первое вхождение символа или подстроки
        // Метод lastIndexOf() - находит последнее вхождение символа или подстроки
        // Они возращают индекс (позицию в строке) где был найден символ или подстрока, при неудачном исходе: -1.
        // int indexOf(char символ, int начальный_индекс) , int indexOf(String строка, int начальный_индекс)
        // int lastIndexOf(char символ, int начальный_индекс) , int lastIndexOf(String строка, int начальный_индекс)
        System.out.println("В строке ffmp 1 mfds, символ 1 имеет первое вхождение с позиции: " + "ffmp 1 mfds".indexOf('1', 0));
/////////////////////Видоизменение символьных строк///////////////////////
        // Объекты типа String неизменяемы, в случае необходимости их изменения требуется их содержимое скопировать в объект типа StringBuffer или StringBuilder,
        // или же воспользоваться одним из методов класса String, создающие новые копии символьных строк с внесенными изменениями.
        // String substring(int начальный_индекс, int конечный_индекс)
        System.out.println("Вырезанная строка с позиции 3 по позицию 6 (не включая), из строки 123456789: " + "123456789".substring(3, 6));
        // String concat(String строка) - аналог операции +
        System.out.println("Соединение ololo ".concat("и azaza методом concat") + " == " + "ololo" + " + azaza");
        // String replace(char исходный, char заменяемый), String replace(CharSequence Исходная_последовательность_символов, CharSequence Заменяемая_последовательность_символов)
        System.out.println("Замена символов в строке lol.replace(o, i) = " + "lol".replace('o', 'i'));
        // String trim() - копия вызывающей строки с удаленными начальными и конечными пробелами
        System.out.println("      haha      " + "без пробелов: " + "             haha          ".trim());
/////////////////////Метод valueOf()///////////////////////
        // static String valueOf(double число) - аналог toString()
        // для char[] : static String valueOf(char символы[], int начальный_индекс, int количество_символов)
        char[] djdjdj = {'s', 'e', 'd', 'o', 'q'};
        System.out.println("С позиции 1, 2 символа в строку, из массимыв char[]: s,e,d,o,q = " + String.valueOf(djdjdj, 1, 2));
/////////////////////Изменение регистра символов в строке///////////////////////
        System.out.println("Строка fnlsd с .toUpperCase(): " + "fnlsd".toUpperCase());
        System.out.println("Строка RKDKD с .toLowerCase(): " + "RKDKD".toLowerCase());
/////////////////////Соединение символьных строк///////////////////////
        System.out.println("Соединение символьных строк \"123\" \"321\" \"456\" с разделителем запятая \",\" = " + String.join(",", "123", "321", "456"));
/////////////////////StringBuffer - класс позволяющий, вносить изменения в строковое содержимое///////////////////////
        StringBuffer strBuf = new StringBuffer("PrivetMedved");
        System.out.println("Длина экземпляра класса StringBuffer: " + strBuf.length());
        System.out.println("Текущий объем выделенной памяти в экземпляре класса StringBuffer: " + strBuf.capacity());
        System.out.println("Буфер экземпляра класса StringBuffer: " + strBuf);
        strBuf.ensureCapacity(30);
        System.out.println("Новая измененная ёмкость экземпляра класса StringBuffer: " + strBuf.capacity());
        strBuf.setLength(15);
        System.out.println("Новая измененная длина экземпляра класса StringBuffer: " + strBuf.length());
        System.out.println("Первый символ в объекте StringBuffer: " + strBuf.charAt(0));
        strBuf.setCharAt(0, 'L');
        System.out.println("Буфер нового экземпляра класса StringBuffer: " + strBuf);
        char[] inputFrom = {'1', '1', '1', '1', '1', '1'};
        strBuf.getChars(0, 6, inputFrom, 0);
        System.out.println("Массив символов импортирующий заданную подстроку из объекта StringBuffer: " + inputFrom);
        int a3 = 42;
        StringBuffer sb = new StringBuffer(40);
        System.out.println("Результат применения метода append к объекту StringBuffer: " + sb.append("a = ").append(a3).append("!").toString());
        StringBuffer sb2 = new StringBuffer("SLOL");
        sb2.insert(1, "OOO");
        System.out.println("Результат применения метода insert к объекту типа StringBuffer: " + sb2);
        sb2.reverse();
        System.out.println("Метод reverse к объекту StringBuffer: " + sb2);
        sb2.delete(3, sb2.length());
        System.out.println("Удаление третьего от символа до последнего, в объекте StringBufer: " + sb2);
        sb2.replace(0, sb2.length(), "HAHA");
        System.out.println("Замена содержимого в объекте StringBuffer: " + sb2);
        System.out.println("Выделение подстроки с позиций 1 и 3, из объекта StringBuffer: " + sb2.substring(1,3));
        StringBuffer sb3 = new StringBuffer("azaza loooool megusta azaza");
        System.out.println("Индекс первого вхождения строки azaza в объекте StringBuffer: " + sb3.indexOf("azaza"));
        System.out.println("Индекс последнего вхождения строки azaza в объекте StringBuffer: " + sb3.lastIndexOf("azaza"));
        // Класс StringBuilder - ничем не отличается от класса StringBuffer, кроме того, что он не синхронизирован.
    }
}

class TestBox {
    private double width, height, depth;

    TestBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() {
        return "Размеры " + width + " на " + depth + " на " + height + ".";
    }

}
