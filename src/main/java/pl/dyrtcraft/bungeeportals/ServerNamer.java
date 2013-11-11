package pl.dyrtcraft.bungeeportals;

/**
 * @author TheMolkaPL (themolkapl@gmail.com)
 */
public class ServerNamer {

	public static String getName(String server) {
		if(server.equalsIgnoreCase("hardcore")) {
			return "Hardcore";
		}
		if(server.equalsIgnoreCase("lobby")) {
			return "Lobby";
		}
		if(server.equalsIgnoreCase("minez")) {
			return "MineZ";
		}
		if(server.equalsIgnoreCase("rpg")) {
			return "RPG";
		}
		if(server.equalsIgnoreCase("skyblock")) {
			return "SkyBlock";
		}
		if(server.equalsIgnoreCase("survivalgames")) {
			return "Survival Games";
		} else {
			// Server not found (Plugin is it up to date?) - use address
			return server;
		}
	}
	
}
