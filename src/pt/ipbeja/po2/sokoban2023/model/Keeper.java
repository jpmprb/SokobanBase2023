package pt.ipbeja.po2.sokoban2023.model;

/**
 * A Keeper is just a mobile element
 * @author anonymized
 * @version 2022/10/13
 * Based on https://en.wikipedia.org/wiki/Sokoban
 */
final class Keeper extends MobileElement {

    /**
     * Creates the Keeper at pos
     *
     * @param pos initial position for the Keeper
     */
    public Keeper(Position pos) {
        super(pos);
    }

}
