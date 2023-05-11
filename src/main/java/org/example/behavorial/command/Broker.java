package org.example.behavorial.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author musa.balin
 */
public class Broker {
    private List<Command> commands = new ArrayList<>();

    public void addCommandToQuery(Command command) {
        commands.add(command);
    }

    public void executeAll(){
        for (Command command:commands){
            command.execute();
        }
    }
}
