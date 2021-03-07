package JavaFundamentals.FundamentalsCoding.src.saturday02_06.nineteenOne;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setSurname("Petraitis");
        author1.setNationality("Lietuvis");

        Author author2 = new Author("Jonaitis", "Lietuvis");
        Author author3 = new Author("Guette", "Vokietis");

        Poem poem1 = new Poem();
        poem1.setAuthor(author1);
        poem1.setStropheNumbers(100);

        Poem poem2 = new Poem(author2, 200);
        Poem poem3 = new Poem(author3, 300);

        Poem[] allPoems = new Poem[3];
        allPoems[0] = poem1;
        allPoems[1] = poem2;
        allPoems[2] = poem3;


        int longestPoemPages = 0;
        Author authorThatWroteLongestPoem = null;
        for (Poem p : allPoems) {
            if (longestPoemPages < p.getStropheNumbers()) {
                longestPoemPages = p.getStropheNumbers();
                authorThatWroteLongestPoem = p.getAuthor();
            }
        }
        System.out.println(authorThatWroteLongestPoem.getSurname() + " wrote longest poem. Pages: " + longestPoemPages);
    }
}
