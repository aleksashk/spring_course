package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "OK";
    }
}
