package com.dima;

import javafx.scene.Parent;

import java.util.regex.*;

class PatternExample {


    public static void main(String[] args) {

        String parrent = "^test";
        String text = "dima test sveta";
        Pattern p = Pattern.compile(parrent);

        Matcher m = p.matcher(text);
        System.out.println(m.lookingAt());

        /*
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("MxxY");
        System.out.println("Input String matches regex - "+matcher.matches());
        */

    }


}