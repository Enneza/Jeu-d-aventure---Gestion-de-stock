
package src.pkg_commands;

import src.pkg_game.*;
import src.pkg_utils.*;
import src.pkg_characters.*;

public abstract class Command {

	protected String command;
    private String secondWord;
    protected UserInterface gui;
    protected GameEngine engine;
    

    public Command() {
        secondWord = null;
    }
    
    public Command(String secondWord) {
        this.secondWord = secondWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    public boolean hasSecondWord() {
        return (secondWord != null);
    }

    public UserInterface getGui() {
		return gui;
	}

	public void setGui(UserInterface gui) {
		this.gui = gui;
	}

	public GameEngine getEngine() {
		return engine;
	}

	public void setEngine(GameEngine engine) {
		this.engine = engine;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

    public abstract boolean execute(Player player);
}