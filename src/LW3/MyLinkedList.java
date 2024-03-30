package LW3.Task8;

import LW3.Node;public class LinkedList {
    private Node head; // Указатель на начало списка
    private Node tail; // Указатель на конец списка

    // Методы с использованием циклов

    // Создание нового узла и добавление его в начало списка
    public void createHead(int value) {
        Node newNode = new Node(value, null);
        if (head == null) { // Если список пустой, новый узел становится и началом, и концом списка
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; // Устанавливаем ссылку на следующий узел нового узла на текущий начальный узел списка
            head = newNode; // Новый узел становится новым началом списка
        }
    }

    // Создание нового узла и добавление его в конец списка
    public void createTail(int value) {
        Node newNode = new Node(value, null);
        if (tail == null) { // Если список пустой, новый узел становится и началом, и концом списка
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; // Устанавливаем ссылку на следующий узел текущего последнего узла на новый узел
            tail = newNode; // Новый узел становится новым концом списка
        }
    }

    // Преобразование списка в строку для вывода
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" "); // Добавляем значение текущего узла в строку
            current = current.next; // Переходим к следующему узлу
        }
        return sb.toString();
    }

    // Добавление нового узла в начало списка
    public void addFirst(int value) {
        createHead(value);
    }

    // Добавление нового узла в конец списка
    public void addLast(int value) {
        createTail(value);
    }

    // Вставка нового узла в список по указанному индексу
    public void insert(int index, int value) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be non-negative");
        }
        if (index == 0) {
            createHead(value); // Вставляем новый узел в начало списка, если индекс равен 0
            return;
        }
        Node newNode = new Node(value, null);
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next; // Двигаемся по списку к узлу, перед которым нужно вставить новый узел
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        newNode.next = current.next; // Устанавливаем ссылку на следующий узел нового узла
        current.next = newNode; // Устанавливаем ссылку на новый узел из предыдущего узла
        if (newNode.next == null) {
            tail = newNode; // Если новый узел становится последним, обновляем указатель на конец списка
        }
    }

    // Удаление первого узла из списка и возврат его значения
    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int value = head.value; // Запоминаем значение удаляемого узла
        head = head.next; // Переходим к следующему узлу (удаляем первый узел)
        if (head == null) {
            tail = null; // Если список стал пустым, обновляем указатель на конец списка
        }
        return value;
    }

    // Удаление последнего узла из списка и возврат его значения
    public int removeLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int value;
        if (head == tail) { // Если в списке только один узел
            value = head.value; // Запоминаем его значение
            head = null;
            tail = null; // Обнуляем указатели на начало и конец списка
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next; // Находим предпоследний узел списка
            }
            value = tail.value; // Запоминаем значение последнего узла
            tail = current; // Предпоследний узел становится последним
            tail.next = null; // Обнуляем ссылку последнего узла
        }
        return value;
    }

    // Удаление узла из списка по указанному индексу и возврат его значения
    public int remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be non-negative");
        }
        if (index == 0) {
            return removeFirst(); // Если индекс равен 0, удаляем первый узел
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next; // Находим узел, перед которым нужно удалить узел
        }
        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        int value = current.next.value; // Запоминаем значение удаляемого узла
        current.next = current.next.next; // Удаляем узел из списка
        if (current.next == null) {
            tail = current; // Если удаляется последний узел, обновляем указатель на конец списка
        }
        return value;
    }

    // Методы с использованием рекурсии

    // Создание нового узла и добавление его в начало списка с использованием рекурсии
    public void createHeadRec(int value) {
        head = createHeadRecHelper(head, value); // Вызываем вспомогательный метод для создания нового узла
        if (tail == null) {
            tail = head; // Если список был пустым, обновляем указатель на конец списка
        }
    }

    private Node createHeadRecHelper(Node current, int value) {
        Node newNode = new Node(value, null); // Создаем новый узел
        if (current == null) { // Если текущий узел пустой, возвращаем новый узел
            return newNode;
        }
        newNode.next = current; // Устанавливаем ссылку на следующий узел нового узла
        return newNode; // Возвращаем новый узел
    }

    // Создание нового узла и добавление его в конец списка с использованием рекурсии
    public void createTailRec(int value) {
        tail = createTailRecHelper(head, value); // Вызываем вспомогательный метод для создания нового узла
        if (head == null) {
            head = tail; // Если список был пустым, обновляем указатель на начало списка
        }
    }

    private Node createTailRecHelper(Node current, int value) {
        Node newNode = new Node(value, null); // Создаем новый узел
        if (current == null) { // Если текущий узел пустой, возвращаем новый узел
            return newNode;
        }
        current.next = createTailRecHelper(current.next, value); // Рекурсивно вызываем метод для следующего узла
        return current; // Возвращаем текущий узел
    }

    // Преобразование списка в строку для вывода с использованием рекурсии
    public String toStringRec() {
        return toStringRecHelper(head); // Вызываем вспомогательный метод для преобразования списка в строку
    }

    private String toStringRecHelper(Node current) {
        if (current == null) { // Если текущий узел пустой, возвращаем пустую строку
            return "";
        }
        return current.value + " " + toStringRecHelper(current.next); // Рекурсивно вызываем метод для следующего узла
    }

    public static void main(String[] args) {
        Node.LinkedList list = new Node.LinkedList();

        // Пример использования методов с циклами
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.insert(2, 4);
        System.out.println("List with cycles: " + list.toString());

        System.out.println("Removed first element: " + list.removeFirst());
        System.out.println("Removed last element: " + list.removeLast());
        System.out.println("Removed element at index 1: " + list.remove(1));
    }
}
