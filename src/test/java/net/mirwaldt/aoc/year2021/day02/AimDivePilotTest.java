package net.mirwaldt.aoc.year2021.day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AimDivePilotTest {
    @Test
    void givenTheSample_when_thenReturnDepthSixtyAndPositionFifteen() {
        DivePilot divePilot = new AimDivePilotSimulator();
        divePilot.forward(5);
        divePilot.down(5);
        divePilot.forward(8);
        divePilot.up(3);
        divePilot.down(8);
        divePilot.forward(2);
        assertEquals(60, divePilot.depth());
        assertEquals(15, divePilot.position());
    }
}
