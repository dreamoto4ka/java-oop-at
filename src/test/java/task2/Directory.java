package task2;

public class Directory {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        PhoneBook phonebook = new PhoneBook();
        System.out.println("--------------------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Smith", "5553649");
        phonebook.add("Smith", "5554931");
        phonebook.add("Davis", "5552497");
        phonebook.add("Davis", "5550481");
        phonebook.add("Garcia", "5557421");
        phonebook.add("Davis", "5552228");
        phonebook.add("Brown", "5554952");

        System.out.println("---------------------------");

        System.out.println("Получаем номера");
        System.out.println("Smith");
        System.out.println(phonebook.get("Smith"));
        System.out.println("Davis");
        System.out.println(phonebook.get("Davis"));
        System.out.println("Garcia");
        System.out.println(phonebook.get("Garcia"));
        System.out.println("Brown");
        System.out.println(phonebook.get("Brown"));
        System.out.println("----------------------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Miller");
        System.out.println(phonebook.get("Miller"));
        System.out.println("-----------------------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Davis", "5552497");
        System.out.println("Davis");
        System.out.println(phonebook.get("Davis"));
    }
}

