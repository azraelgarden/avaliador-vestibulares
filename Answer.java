package com.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Answer {

    public static void main(String[] args) {

        String path = "C:\\Users\\PICHAU\\Desktop\\0707\\gabarito.txt";
        String output = "C:\\Users\\PICHAU\\Desktop\\0707\\resultado.txt";
        

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            ArrayList<Candidate> candidates = new ArrayList<>();
            candidates.add(new Candidate("12134", "bcdadceeaabdeaeaabcdadceeadeaeaabcdaceeeababceabceda"));
            candidates.add(new Candidate("12131", "cbabcadeacbaeabdeaeaabcdaeeaabdaabdeaeaabcedaaabdeae"));
            candidates.add(new Candidate("12233", "abdeaeaabcdaeeaabdaabdeaeadeaeaabcdaeeaabdaabdeaeaaa"));
            candidates.add(new Candidate("13311", "cbabcadeacbaeabdeaeaabcdaeeaabdaabdeaeaabcedaaabdeae"));
            candidates.add(new Candidate("14411", "eabdeaeaabcdaeeaabdaaeaabcdaeeaaeaeaabcdaeeaabdaabde"));

            for(Candidate candidate : candidates) {
                int index = 0;
                String answer = candidate.getAnswers();
                for(int i=0; i < line.length(); i++) {
                    if(answer.charAt(i) == line.charAt(i)) {
                        index++;
                    }
                }
                candidate.setIndex(index);
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(output))){
                for (Candidate candidate : candidates) {
                    bw.write(candidate.toString());
                    bw.newLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (IOException e) {
            System.out.println("Encontramos um erro: " + e.getMessage());
        }
    }

}

