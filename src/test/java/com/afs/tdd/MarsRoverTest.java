package com.afs.tdd;

import enums.Direction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    void should_locationY_add_one_space_when_execute_commands_given_direction_N_and_command_M () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        String command = "M";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 1 N", result);
    }

    @Test
    void should_locationY_add_one_space_when_execute_commands_given_direction_S_and_command_M () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        String command = "M";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 -1 S", result);
    }

    @Test
    void should_locationY_add_one_space_when_execute_commands_given_direction_E_and_command_M () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        String command = "M";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("1 0 E", result);
    }

    @Test
    void should_locationY_add_one_space_when_execute_commands_given_direction_W_and_command_M () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        String command = "M";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("-1 0 W", result);
    }

    @Test
    void should_direction_become_W_when_execute_commands_given_direction_N_and_command_L () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        String command = "L";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 0 W", result);
    }

    @Test
    void should_direction_become_E_when_execute_commands_given_direction_S_and_command_L () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        String command = "L";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 0 E", result);
    }

    @Test
    void should_direction_become_N_when_execute_commands_given_direction_E_and_command_L () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        String command = "L";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 0 N", result);
    }

    @Test
    void should_direction_become_S_when_execute_commands_given_direction_W_and_command_L () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        String command = "L";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 0 S", result);
    }

    @Test
    void should_direction_become_E_when_execute_commands_given_direction_N_and_command_R () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        String command = "R";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 0 E", result);
    }

    @Test
    void should_direction_become_W_when_execute_commands_given_direction_S_and_command_R () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        String command = "R";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 0 W", result);
    }

    @Test
    void should_direction_become_S_when_execute_commands_given_direction_E_and_command_R () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        String command = "R";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 0 S", result);
    }

    @Test
    void should_direction_become_N_when_execute_commands_given_direction_W_and_command_R () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        String command = "R";

        // when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        // then
        assertEquals("0 0 N", result);
    }

    @Test
    void should_return_final_result_when_execute_commands_given_batches_of_instructions () {
        // given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        String commands = "MLMR";

        // when
        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();

        // then
        assertEquals("-1 1 N", result);
    }
}
