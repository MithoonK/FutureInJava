package TestBuilderConcept;

public class New {

    private String str;

    public String getStr() {
        return str;
    }

    public New(String str) {
        this.str = str;
    }

    public static class Builder {
        private String str;

        public Builder() {
        }

        public  Builder setStr(String str) {
            this.str = str;
            return this;
        }

        public New build() {
            return new New(str);
        }


    }
}
