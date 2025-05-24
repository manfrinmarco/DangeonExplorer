package manfrinmarco.map.custom;

import manfrinmarco.annotations.AutoLoad;
import manfrinmarco.map.Room;
import manfrinmarco.map.RoomTemplate;

@AutoLoad
public class GuardRoom implements RoomTemplate {
    @Override
    public String getType() {
        return "guardie";
    }

    @Override
    public Room create() {
        return new Room("La stanza delle guardie", "c'è qualcuno nell'ombra a guardia della stanza.");
    }
}