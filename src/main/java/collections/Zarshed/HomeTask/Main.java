package collections.Zarshed.HomeTask;

import java.util.HashMap;

public class Main{
        public static void main(String[] args) {




                HashMap<String,String> song=new HashMap();
                song.put("Calum Scott", "You are the reason");
                song.put("Billie Eilish","Lovely");
                song.put("Drake","Life is good");



            System.out.println(song.get("Drake"));


            song.forEach((k,v)->System.out.println(k+" "+v));



        }
}
