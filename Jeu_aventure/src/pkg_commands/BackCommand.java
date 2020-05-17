
package src.pkg_commands;

import src.pkg_characters.*;


public class BackCommand extends Command {
	
	public BackCommand() {
		command = "back";
	}

	@Override
	public boolean execute(Player player) {

		if (engine.getDisplacement().isEmpty()) {
            gui.println("You are at the start Point");
            gui.setButtonColor(engine.getCurrentRoom().getExitButton());
        } else {
            engine.setCurrentRoom(engine.getDisplacement().pop());
            gui.println("You back to " + engine.getCurrentRoom().getDescription());
            gui.println("You Maybe Missed those " + engine.getCurrentRoom().getItemsDescription());
            gui.setButtonColor(engine.getCurrentRoom().getExitButton());
            if (engine.getCurrentRoom().getImageName() != null)
                gui.showImage(engine.getCurrentRoom().getImageName());
        }
		return false;
	}

}
