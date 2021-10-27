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
