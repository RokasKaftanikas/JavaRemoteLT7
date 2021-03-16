package DesignPatters.strategy;

public class ReplaceWithUnderscoreStrategy implements SpacesModificationStrategy{
    @Override
    public String modify(final String input) {
        final StringBuilder stringBuilder = new StringBuilder(input.length());
        for (final char c : input.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append('_');
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
