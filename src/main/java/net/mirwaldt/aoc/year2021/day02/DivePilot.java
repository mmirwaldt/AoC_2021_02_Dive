package net.mirwaldt.aoc.year2021.day02;

public interface DivePilot {
    int depth();
    int position();

    void forward(int dx);
    void up(int dy);
    void down(int dy);
}
