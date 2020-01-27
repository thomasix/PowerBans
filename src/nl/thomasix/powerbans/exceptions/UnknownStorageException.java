package nl.thomasix.powerbans.exceptions;

public class UnknownStorageException extends Exception {

    public UnknownStorageException(String choosen) {
        super("Choosen storage type '" + choosen + "' is not recognised!");
    }

    public UnknownStorageException() {
        super("Choosen storage type is not recognised!");
    }
}
