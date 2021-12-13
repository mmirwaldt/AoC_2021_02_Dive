package net.mirwaldt.aoc.year2021.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // part one
        final List<String> lines = Files.readAllLines(Path.of("input"), StandardCharsets.US_ASCII);
        DivePilot divePilot = new DivePilotSimulator();
        for (String line : lines) {
            String[] tokens = line.split(" ");
            String command = tokens[0];
            int x = Integer.parseInt(tokens[1]);
            if(command.equals("forward")) {
                divePilot.forward(x);
            } else if(command.equals("up")) {
                divePilot.up(x);
            } else if(command.equals("down")) {
                divePilot.down(x);
            } else {
                throw new RuntimeException("Cannot handle command '" + command + "'.");
            }
        }
        System.out.println(divePilot.depth() * divePilot.position());
    }
}
