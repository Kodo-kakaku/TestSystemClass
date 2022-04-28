package test;

public record Answer(String answer) {
    @Override
    public String answer() {
        return answer;
    }
}