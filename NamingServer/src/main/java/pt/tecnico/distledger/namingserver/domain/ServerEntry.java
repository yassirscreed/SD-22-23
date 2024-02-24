package pt.tecnico.distledger.namingserver.domain;

public class ServerEntry {
    private String address;
    private String qualifier;

    public ServerEntry(String address, String qualifier) {
        this.address = address;
        this.qualifier = qualifier;
    }

    // Getters e setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
    
}

