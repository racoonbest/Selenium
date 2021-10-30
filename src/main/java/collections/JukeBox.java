package collections;

import java.util.HashMap;

public class JukeBox {
    public static void main (String[]args){


        HashMap<String,String>playsong=new HashMap<>();

        playsong.put ("Jazz", "ldkjfwoeij145sd3");
        playsong.put ("Indie rock", "weiruskd8854dwerdf");
        playsong.put ("Oldies", "lskjrwoejrlj8595serw");
        playsong.put ("Hip - hop", "lskdjfwoeir898745wersdf");


        playsong.forEach((k, v)-> System.out.println(k+" "+v));


    }


}
