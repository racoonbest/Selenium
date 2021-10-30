package collections.Zarshed;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
      HashMap<String,String>phonebook=new HashMap();
      phonebook.put("Mike", "+1(322)321-32-53");
      phonebook.put("Jake", "+1(543)654-43-65");
      phonebook.put("Lisa", "+1(423)432-56-23");
      phonebook.put("John", "+1(423)432-52-63");
      phonebook.put("Frank","+1(432)543-90-03");

      phonebook.forEach((k,v)->{
          if(k.startsWith("J"))
              System.out.println(k+" "+v);
      });

    }
}
