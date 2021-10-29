package collections;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {


        HashMap dictionary = new HashMap();
        dictionary.put("house", "jlsdkfjeio124wef");
        dictionary.put("cars", "oeirjjkdflj584df");
        dictionary.put("furniture", "woieurksv589sdfw");

        System.out.println(dictionary);



        HashMap<String,String>phonebook=new HashMap<>();
        phonebook.put("Bob", "123");
        phonebook.put("Alisa", "456");
        phonebook.put("Lisa", "789");
        phonebook.put("john", "741");
        phonebook.put("mayk", "852");

        System.out.println(phonebook);
        phonebook.forEach((k, v)->{
            if(k.startsWith("j"))
                System.out.println(k+" "+v);

        });
        }


    }
