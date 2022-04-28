package test;

import java.util.Arrays;

public class AnswersOptions {
    private final String[] options;

    public AnswersOptions(String... option) {
        this.options = Arrays.copyOf(option, option.length);
    }

    public String[] getOptions() {
        return options;
    }

    public String getOption(int index) {
        return this.options[index];
    }
}
