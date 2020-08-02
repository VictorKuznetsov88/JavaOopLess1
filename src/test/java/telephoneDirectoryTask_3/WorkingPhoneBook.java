package telephoneDirectoryTask_3;

public class WorkingPhoneBook {
    public static void main(String[] args){
        PhoneBook phonebook = new PhoneBook();

        System.out.println("Наполняем справочник:");
        phonebook.add("Иванов", "3234545");
        phonebook.add("Лещев", "3234646");
        phonebook.add("Ким", "3234747");
        phonebook.add("Ким", "3234848");
        phonebook.add("Иванов", "3234949");
        System.out.println("**************");

        System.out.println("Получаем номера:");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Лещев");
        System.out.println(phonebook.get("Лещев"));
        System.out.println("Ким");
        System.out.println(phonebook.get("Ким"));
        System.out.println("**************");

        System.out.println("Случай отсутствия записи:");
        System.out.println(phonebook.get("Петров"));
        System.out.println("**************");

        System.out.println("Пробуем записать существующий номер:");
        phonebook.add("Иванов", "3234949");
        System.out.println(phonebook.get("Иванов"));
    }
}
