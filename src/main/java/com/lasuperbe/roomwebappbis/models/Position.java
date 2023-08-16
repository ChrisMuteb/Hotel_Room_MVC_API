package com.lasuperbe.roomwebappbis.models;

public enum Position {
    CONCIERGE, SECURITY, FRONT_DESK, HOUSEKEEPING;

    public String toString(){
        switch (this){
            case CONCIERGE: return "Concierge";
            case HOUSEKEEPING: return "Housekeeping";
            case SECURITY: return "Security";
            case FRONT_DESK: return "Front Desk";
        }
        return "";
    }
}
