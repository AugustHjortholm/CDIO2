package main;

public class English extends Language {
    @Override
    void setFieldTitles() {
        this.fieldTitles = new String[]{
                "Start",
                "",
                "Tower",
                "Crater",
                "Palace gates",
                "Cold desert",
                "Walled city",
                "Monastery",
                "Black cave",
                "Huts in the mountain",
                "The werewall",
                "The pit",
                "Goldmine",
        };
    }

    @Override
    void setFieldSubtexts() {
        this.fieldSubtexts = new String[]{
                "",
                "",
                "+250",
                "-100",
                "+100",
                "-20",
                "+180",
                "0",
                "-70",
                "+60",
                "-80, Extra turn",
                "-50",
                "+650"
        };
    }

    @Override
    void setFieldDescriptions() {
        this.fieldDescriptions = new String[]{
                "",
                "",
                "You reached the Tower and found a gold chest",
                "You fell down a crater and lost your wallet",
                "You found the hidden palace and the master is happy to see you, for your trouble he gave you some gold",
                "You reached the cold desert and had to buy warm clothes",
                "You found the Walled City which had been lost to time, you get awarded for your discovery",
                "You reached the monastery, the monks ignored you.",
                "You stumbled upon a black cave, but as you enter you hear a dark and scary voice. You ran away as fast as possible and dropped some gold.",
                "You found some abandoned huts in the mountain, you choose to loot it and found some gold",
                "You get lost on your way and reached the Werewall, he demanded you pay him gold to live. You did and ran away afterwards",
                "You fell down a pit and lost some gold",
                "You found gold in the mountain and sold it for 650, you are rich!"
        };
    }

    @Override
    void setFieldRents() {
        this.fieldRents = new String[]{
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
    }

    @Override
    void setFieldMessages() {
        this.fieldMessages = new String[]{
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
    }
}
