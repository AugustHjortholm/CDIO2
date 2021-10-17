package main;

abstract public class Language {
    protected Language() {
        fieldTitles = new String[13];
        fieldSubtexts = new String[13];
        fieldDescriptions = new String[13];
        fieldMessages = new String[13];

        setFieldTitles();
        setFieldSubtexts();
        setFieldDescriptions();
        setFieldMessages();
    }

    abstract void setFieldTitles();
    abstract void setFieldSubtexts();
    abstract void setFieldDescriptions();
    abstract void setFieldMessages();

    public final String getFieldTitle(int field) {
        return fieldTitles[field];
    }

    public final String getFieldSubtexts(int field) {
        return fieldSubtexts[field];
    }

    public final String getFieldDescriptions(int field) {
        return fieldDescriptions[field];
    }

    public final String getFieldMessages(int field) {
        return fieldMessages[field];
    }

    protected String[] fieldTitles;
    protected String[] fieldSubtexts;
    protected String[] fieldDescriptions;
    protected  String[] fieldMessages;
}
