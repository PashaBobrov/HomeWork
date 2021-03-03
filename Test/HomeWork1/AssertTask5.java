package HomeWork1;

import HomeWork1.API.ICommunicationPrinter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssertTask5 {
    static void assertTask5(ICommunicationPrinter communicationPrinter) {
        assertEquals("Привет\n" + "Я тебя так долго ждал", communicationPrinter.welcom("Вася"));
        assertEquals("Я тебя так долго ждал", communicationPrinter.welcom("Анастасия"));
        assertEquals("Добрый день, а вы кто?", communicationPrinter.welcom("fgnmfng"));
    }
}
