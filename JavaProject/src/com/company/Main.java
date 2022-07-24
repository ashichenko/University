import com.company.model.*;
import com.company.util.Converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Address firstAddress = new Address("Minsk", "Frunze", 8, 25);
        Address secondAddress = new Address("Gomel", "Lenin", 48, 15);
        Address thirdAddress = new Address("Minsk", "Masherov", 17, 196);
        Address fourthAddress = new Address("Vitebsk", "Vsneev", 101, 98);
        Address fifthAddress = new Address("Baranovichi", "Gogol", 4, 12);

        Student Tom = new Student("Tom", "Smith", 18, firstAddress);
        Student Nik = new Student("Nik", "Ivanov", 45, thirdAddress);
        Student Misha = new Student("Misha", "Petrov", 32, fourthAddress);
        List<Student> students = new ArrayList<>();
        students.add(Tom);
        students.add(Nik);
        students.add(Misha);

        Teacher John = new Teacher("John", "Bob", 40, secondAddress, 150, 15);
        Teacher Oleg = new Teacher("Oleg", "Sidorov", 55, fifthAddress, 100, 10);
        Teacher Alex = new Teacher("Alex", "Kane", 38, fifthAddress, 120, 20);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(John);
        teachers.add(Oleg);
        teachers.add(Alex);



        //Group ASD = new Group("First", 2, <students>, John);

        //System.out.println("Адрес Тома: " + Tom.address);
        //Tom.changeAddressSt(secondAddress);
        //System.out.println("Адрес Джона: " + John.address);
        //John.changeAddressT(firstAddress);
        //Teacher.Salary(160, 5);

        //System.out.println(students);
        //System.out.println(teachers);


        //➢	создать список учителей и отобразить их (в методе main);
        Stream stream = teachers.stream();
        stream.filter(x -> x.toString().length() == 3)
                .forEach(System.out::println);
        teachers.stream()
                .forEach(x -> System.out.println(x));
        //пробел
        System.out.println(" ");

        //отобразить учителей у которых заработная плата выше определенной суммы
        teachers.stream()
                .filter(a -> a.getRate() * a.getWorkhours() > 1200)
                .forEach(a -> System.out.println(a));
        //пробел
        System.out.println(" ");

        //сортировать весь персонал в алфавитном порядке (необходимо где-то хранить весь список персонала).
        teachers.stream()
                .sorted(Comparator.comparing(Teacher::getName))
                .collect(Collectors.toList());
        teachers.forEach(System.out::println);
        //пробел
        System.out.println(" ");

        //создать список групп и отобразить группы, чей год выпуска находится в заданном диапазоне
        // (добавить в группу поля: год выпуска, год поступления);
        Group firstGroup = new Group("first", 2, students, John, 2010, 2015);
        Group secondGroup = new Group("second", 1, students, Oleg, 2012, 2017);
        Group thirdGroup = new Group("third", 5, students, Alex, 2018, 2022);
        List<Group> groups = new ArrayList<>();
        groups.add(firstGroup);
        groups.add(secondGroup);
        groups.add(thirdGroup);
        Stream stream2 = groups.stream();
        groups.stream()
                .filter(x -> x.getGraduation() <= 2020 && x.getGraduation() >= 2010)
                .forEach(System.out::println);
        //пробел
        System.out.println(" ");

        //методиста преобразовать в учителя
        Converter<Methodist, Teacher> teacherConvertor = (teacher) -> new Methodist(teacher.getName(), teacher.getSurname(), teacher.getAge(), teacher.getAddress(), "m");
        Teacher teacher1 = new Teacher("Nik", "Ivanov", 42, new Address("Mindk", "Lenin", 12, 56), 100, 50);
        //Methodist methodist1 = new Methodist(teacher1.getName(), teacher1.getSurname(), teacher1.getAge(), teacher1.getAddress());
        Methodist methodist2 = teacherConvertor.convert(teacher1);
        System.out.println(methodist2);


        Collections.sort(students);
        System.out.println(students);


    }

}
