import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevensTest {

    Sevens sevens = new Sevens();
    Hand[] sevensTableHands = sevens.createSevensTableHands();

    @Test
    void createSevensTableHands(){
        assertEquals(4 , sevensTableHands.length);
    }

    @Test
    void playToSevenHandCanPlaySevenToEmptyHand(){
        assertTrue(sevens.playToSevenHand(new Card("H7"), new Hand(),false));
    }

    @Test
    void playToSevenHandCanNotPlaySevenToHandWithCards(){
        assertTrue(sevens.playToSevenHand(new Card("H7"), new Hand("H2,H3"),false));
    }

    @Test
    void playToSevenHandSevenToEmptyHand(){
        assertTrue(sevens.playToSevenHand(new Card("H7"), new Hand(),true));
    }

    @Test
    void canPlayToSevenHandSixWithH7Hand(){
        assertTrue(sevens.playToSevenHand(new Card("H6"), new Hand("H7"),false));
    }

    @Test
    void canNotPlayToSevenHandFiveWithH7Hand(){
        assertFalse(sevens.playToSevenHand(new Card("H5"), new Hand("H7"),false));
    }

    @Test
    void playToSevenHandSixWithH7Hand(){
        assertTrue(sevens.playToSevenHand(new Card("H6"), new Hand("H7"),true));
    }

    @Test
    void canPlayToSevenHandEightWithH7Hand(){
        assertTrue(sevens.playToSevenHand(new Card("H8"), new Hand("H7"),false));
    }

    @Test
    void canNotPlayToSevenHandNineWithH7Hand(){
        assertFalse(sevens.playToSevenHand(new Card("H9"), new Hand("H7"),false));
    }

    @Test
    void playToSevenHandEightWithH7Hand(){
        assertTrue(sevens.playToSevenHand(new Card("H8"), new Hand("H7"),true));
    }

}