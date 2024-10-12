package LW8.Task3;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyNewsParser {
    public static void main(String[] args) {
        String fileName = "untitled/src/LW8/Task3/example.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Connection.Response response = Jsoup.connect("https://www.rbc.ru/short_news")
                    .userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21 (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21")
                    .timeout(10000)
                    .ignoreHttpErrors(true)
                    .execute();
            int statusCode = response.statusCode();
            if (statusCode == 200) {
                Document doc = Jsoup.connect("https://www.rbc.ru/short_news").get();
                Elements newsParent = doc
                        .select("#maincontent > div > div.l-row.js-news-feed-list");
                for (int i = 4; i < 40; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        String title = ((Element) nodes.get(i))
                                .getElementsByClass("item__title").text();
                        String time = ((Element) nodes.get(i))
                                .getElementsByClass("item__category").text();

                        if (!title.isEmpty() && !time.isEmpty()) {
                            System.out.println("Заголовок: " + title);
                            writer.write("Заголовок: " + title + "\n");
                            System.out.println("Тема и время: " + time + "\n");
                            writer.write("Тема и время: " + time + "\n\n");
                        }
                    }
                }
            } else {
                System.out.println("Ошибка при обращении к серверу: " + statusCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
