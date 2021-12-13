package net.mirwaldt.aoc.year2021.day02;

public class DivePilotSimulator implements DivePilot {
    private int depth, position;

    @Override
    public int depth() {
        return depth;
    }

    @Override
    public int position() {
        return position;
    }

    @Override
    public void forward(int x) {
        position += x;
    }

    @Override
    public void up(int x) {
        depth -= x;
    }

    @Override
    public void down(int x) {
        depth += x;
    }
}
