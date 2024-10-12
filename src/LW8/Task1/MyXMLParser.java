package LW8.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;
public class MyXMLParser {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            File inputFile = new File("untitled/src/LW8/Task1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            boolean exit = false;
            while (!exit) {
                System.out.println("\nВыберите действие:");
                System.out.println("1 - Добавить книгу");
                System.out.println("2 - Найти книгу");
                System.out.println("3 - Удалить книгу");
                System.out.println("4 - Вывести все книги");
                System.out.println("5 - Выход");
                System.out.print("Введите номер действия: ");
                String choice = in.nextLine();

                switch (choice) {
                    case "1": // Добавить книгу
                        System.out.print("Введите название книги: ");
                        String nameBook = in.nextLine();
                        System.out.print("Введите имя автора: ");
                        String author = in.nextLine();
                        System.out.print("Введите год издания: ");
                        String year = in.nextLine();

                        Element root = doc.getDocumentElement();
                        Element newBook = doc.createElement("book");
                        root.appendChild(newBook);

                        Element title = doc.createElement("title");
                        title.appendChild(doc.createTextNode(nameBook));
                        newBook.appendChild(title);

                        Element authorElement = doc.createElement("author");
                        authorElement.appendChild(doc.createTextNode(author));
                        newBook.appendChild(authorElement);

                        Element yearElement = doc.createElement("year");
                        yearElement.appendChild(doc.createTextNode(year));
                        newBook.appendChild(yearElement);

                        saveChanges(doc, inputFile);
                        System.out.println("Книга успешно добавлена!");
                        break;

                    case "2": // Найти книгу
                        System.out.print("Введите имя автора: ");
                        String searchAuthor = in.nextLine();
                        System.out.print("Введите год издания: ");
                        String searchYear = in.nextLine();

                        NodeList nodeList = doc.getElementsByTagName("book");
                        boolean found = false;
                        for (int i = 0; i < nodeList.getLength(); i++) {
                            Node node = nodeList.item(i);
                            if (node.getNodeType() == Node.ELEMENT_NODE) {
                                Element element = (Element) node;
                                if (element.getElementsByTagName("author").item(0).getTextContent().equals(searchAuthor) &&
                                        element.getElementsByTagName("year").item(0).getTextContent().equals(searchYear)) {
                                    System.out.println("Книга найдена: " + element.getElementsByTagName("title").item(0).getTextContent());
                                    found = true;
                                }
                            }
                        }
                        if (!found) {
                            System.out.println("Книга не найдена.");
                        }
                        break;

                    case "3": // Удалить книгу
                        System.out.print("Введите название книги для удаления: ");
                        String titleBook = in.nextLine();

                        nodeList = doc.getElementsByTagName("book");
                        boolean deleted = false;
                        for (int i = 0; i < nodeList.getLength(); i++) {
                            Node node = nodeList.item(i);
                            if (node.getNodeType() == Node.ELEMENT_NODE) {
                                Element element = (Element) node;
                                if (element.getElementsByTagName("title").item(0).getTextContent().equals(titleBook)) {
                                    element.getParentNode().removeChild(element);
                                    deleted = true;
                                }
                            }
                        }
                        if (deleted) {
                            saveChanges(doc, inputFile);
                            System.out.println("Книга успешно удалена!");
                        } else {
                            System.out.println("Книга не найдена.");
                        }
                        break;

                    case "4": // Вывести все книги
                        nodeList = doc.getElementsByTagName("book");
                        if (nodeList.getLength() > 0) {
                            System.out.println("Все книги в файле:");
                            for (int i = 0; i < nodeList.getLength(); i++) {
                                Node node = nodeList.item(i);
                                if (node.getNodeType() == Node.ELEMENT_NODE) {
                                    Element element = (Element) node;
                                    System.out.println("Название: " + element.getElementsByTagName("title").item(0).getTextContent());
                                    System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                                    System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
                                    System.out.println("------------------------");
                                }
                            }
                        } else {
                            System.out.println("Книг в файле нет.");
                        }
                        break;

                    case "5": // Выход
                        exit = true;
                        System.out.println("Выход из программы.");
                        break;

                    default: // Некорректный ввод
                        System.out.println("Некорректный ввод. Попробуйте снова.");
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для сохранения изменений в XML файл
    private static void saveChanges(Document doc, File inputFile) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(inputFile);
        transformer.transform(source, result);
    }
}
