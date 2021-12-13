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
    public void forward(int dx) {
        position += dx;
    }

    @Override
    public void up(int dy) {
        depth -= dy;
    }

    @Override
    public void down(int dy) {
        depth += dy;
    }
}
