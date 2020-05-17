
package src.pkg_commands;

import src.pkg_characters.*;

public class InventoryCommand extends Command {

	public InventoryCommand() {
		// TODO Auto-generated constructor stub
		command = "inventory";
	}
	
	/**
	 * This function print the things present in the bag
	 * 
	 * @param player
	 */
	@Override
	public boolean execute(Player player) {
		// TODO Auto-generated method stub
		gui.print(player.showMyBag());
        gui.print("\n");
		return false;
	}

}
