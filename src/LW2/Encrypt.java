package LW2;

public class Encrypt {

    public static String getEncryptString(String encryptString, int shift){
        // преобразуем переданную в метод строку в символьный нассив
        char[] arrayChar = encryptString.toCharArray();
        // создаем массив с типом данных long, размер массива равен размеру символьного массива
        long[] arrayInt = new long[arrayChar.length];
        // создоем символьный моссив в который будем записывать преобразованные символы
        char[] arrayCharNew = new char[arrayChar.length];
        //в цикле перебираем все символы из которых состоит переданная нами строка, прибавляем к ним число, ключ (сдвиг)
        for (int i = 0; i < arrayChar.length; i++) {
            // прибовляем к символу с индексом і сдвиг
            arrayInt[i] = arrayChar[i] + shift;
            // преобразовываем число в символ char и записываем на нужное место в новый массив
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew); // преобразовывоем новый моссив символов в строку

        return encryptString; // возврощаем строку в метод из которого был вызван текущий метод
    }

    public static String getDecryptString(String decryptString, int shift) {
        // преобразуем переданную в метод строку в символьный нассив
        char[] arrayChar = decryptString.toCharArray();
        // создаем массив с типом данных long, размер массива равен размеру символьного массива
        long[] arrayInt = new long[arrayChar.length];
        // создоем символьный моссив в который будем записывать преобразованные символы
        char[] arrayCharNew = new char[arrayChar.length];
        //в цикле перебираем все символы из которых состоит переданная нами строка, вычитаем из них число, ключ (сдвиг)
        for (int i = 0; i < arrayChar.length; i++) {
            // прибовляем к символу с индексом і сдвиг
            arrayInt[i] = arrayChar[i] - shift;
            // преобразовываем число в символ char и записываем на нужное место в новый массив
            arrayCharNew[i] = (char) arrayInt[i];
        }
        decryptString = new String(arrayCharNew); // преобразовывоем новый моссив символов в строку

        return decryptString; // возврощаем строку в метод из которого был вызван текущий метод
    }
}
