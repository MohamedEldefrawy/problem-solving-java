package com.problemsolving;

import com.problemsolving.stringmanuplation.Pangrams;
import com.problemsolving.stringmanuplation.SherlockAndTheValidString;

public class Main {
  public static void main(String[] args) {
    Pangrams pangrams = new Pangrams();
    String result = pangrams.pangrams("We promptly judged antique ivory buckles for the next prize");
    System.out.println(result);
  }
}
