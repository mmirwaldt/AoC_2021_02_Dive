package net.mirwaldt.aoc.year2021.day02;

public class AimDivePilotSimulator implements DivePilot {
    private int depth, position, aim;

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
        depth += aim * x;
    }

    @Override
    public void up(int x) {
        aim -= x;
    }

    @Override
    public void down(int x) {
        aim += x;
    }
}
