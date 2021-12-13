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
        dive(lines, divePilot);
        System.out.println(divePilot.depth() * divePilot.position()); // result: 2102357

        // part two
        DivePilot aimDivePilot = new AimDivePilotSimulator();
        dive(lines, aimDivePilot);
        System.out.println(aimDivePilot.depth() * aimDivePilot.position()); // result: 2101031224
    }

    private static void dive(List<String> lines, DivePilot divePilot) {
        for (String line : lines) {
            String[] tokens = line.split(" ");
            String command = tokens[0];
            int x = Integer.parseInt(tokens[1]);
            switch (command) {
                case "forward" -> divePilot.forward(x);
                case "up" -> divePilot.up(x);
                case "down" -> divePilot.down(x);
                default -> throw new RuntimeException("Cannot handle command '" + command + "'.");
            }
        }
    }
}
