package net.mirwaldt.aoc.year2021.day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivePilotTest {
    @Test
    void givenUnmoved_whenAskForDepthAndPosition_thenReturnZeros() {
        DivePilot divePilot = new DivePilotSimulator();
        assertEquals(0, divePilot.depth());
        assertEquals(0, divePilot.position());
    }

    @Test
    void givenForwardTwo_whenAskForDepthAndPosition_thenReturnDepthZeroAndPositionTwo() {
        DivePilot divePilot = new DivePilotSimulator();
        divePilot.forward(2);
        assertEquals(0, divePilot.depth());
        assertEquals(2, divePilot.position());
    }

    @Test
    void givenDownThree_whenAskForDepthAndPosition_thenReturnDepthThreeAndPositionZero() {
        DivePilot divePilot = new DivePilotSimulator();
        divePilot.down(3);
        assertEquals(3, divePilot.depth());
        assertEquals(0, divePilot.position());
    }

    @Test
    void givenDownTwoForwardThree_whenAskForDepthAndPosition_thenReturnDepthThreeAndPositionZero() {
        DivePilot divePilot = new DivePilotSimulator();
        divePilot.down(2);
        divePilot.forward(3);
        assertEquals(2, divePilot.depth());
        assertEquals(3, divePilot.position());
    }

    @Test
    void givenDownThreeUpTwo_whenAskForDepthAndPosition_thenReturnDepthOneAndPositionZero() {
        DivePilot divePilot = new DivePilotSimulator();
        divePilot.down(3);
        divePilot.up(2);
        assertEquals(1, divePilot.depth());
        assertEquals(0, divePilot.position());
    }

    @Test
    void givenDownThreeUpTwoForwardFour_whenAskForDepthAndPosition_thenReturnDepthOneAndPositionFour() {
        DivePilot divePilot = new DivePilotSimulator();
        divePilot.down(3);
        divePilot.up(2);
        divePilot.forward(4);
        assertEquals(1, divePilot.depth());
        assertEquals(4, divePilot.position());
    }
}
