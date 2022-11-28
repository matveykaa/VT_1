package laba1;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof ProgrammerBook) {
            return super.equals(obj) && language == ((ProgrammerBook) obj).language && level == ((ProgrammerBook) obj).level;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s; Language - %s; Level - %d;",super.toString(), language, level);
    }
}
