package nl.thomasix.powerbans.data;

import nl.thomasix.powerbans.exceptions.UnknownStorageException;
import nl.thomasix.powerbans.main.PowerBans;

public class DataManager {

    private StorageType storageType = StorageType.UNKNOWN;

    public DataManager(PowerBans powerBans) throws UnknownStorageException {
        String configType = powerBans.getConfig().getString("storage.storage-type");
        if(configType.equalsIgnoreCase("MYSQL")) {
            this.storageType = StorageType.MYSQL;
        } else if(configType.equalsIgnoreCase("YAML")){
            this.storageType = StorageType.YAML;
        } else {
            throw new UnknownStorageException(configType);
        }
    }
}
