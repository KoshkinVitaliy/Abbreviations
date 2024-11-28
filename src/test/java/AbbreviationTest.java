import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbbreviationTest {
    Abbreviation abbreviation = new Abbreviation();
    @Test
    public void testDefaultAbbreviation() {
        assertEquals(
                "As soon as possible",
                abbreviation.showAbbreviations("asap"),
                "Method must show abbreviation in the beginning " +
                        "with the first upperCase letter."
        );
    }

    @Test
    public void testEmptyString() {
        assertEquals(
                "",
                abbreviation.showAbbreviations("asap"),
                "Method must return empty message if the message has no symbols in it."
        );
    }

    @Test
    public void testSeveralAbbreviations() {
        assertEquals(
                "Tomorrow too easy",
                abbreviation.showAbbreviations("2mor2ez"),
                "Method must return all abbreviations and make correct spaces between them."
        );
    }

    @Test
    public void testMessage() {
        assertEquals(
                "Tomorrow me must play together as soon as possible.",
                abbreviation.showAbbreviations("2mor we must play together asap."),
                "Method must return all abbreviations with the message " +
                        "and make correct spaces between them."
        );
    }

    @Test
    public void testCenterMessage() {
        assertEquals(
                "My brother in my humble opinion is the best player.",
                abbreviation.showAbbreviations("My brother imho is the best player."),
                "Method must return all abbreviations with the message " +
                        "and make correct spaces between them."
        );
    }

    @Test
    public void testAllAbbreviations() {
        assertEquals(
                "Tomorrow too easy always a pleasure as soon as possible do you remember in my humble opinion",
                abbreviation.showAbbreviations("2mor2ezaapasapdurimho"),
                "Method must return all abbreviations with the message " +
                        "and make correct spaces between them."
        );
    }

    @Test
    public void testRegister() {
        assertEquals(
                "Always a pleasure to PLAY with my sister.",
                abbreviation.showAbbreviations("AAp to PLAY with my sister."),
                "Method must return all abbreviations with the message in " +
                        "different cases(upper/lower) and make correct spaces between them."
        );
    }

    @Test
    public void testIncorrectAbbreviations() {
        assertEquals(
                "ASAT we get to the point too easy 2moq.",
                abbreviation.showAbbreviations("ASAT we get to the point 2ez 2moq."),
                "Method must return all correct abbreviations with the message in " +
                        "different cases(upper/lower) and make correct spaces between them."
        );
    }

    @Test
    public void testFence() {
        assertEquals(
                "Do you remember as soon as possible too easy",
                abbreviation.showAbbreviations("DuRaSaP2Ez"),
                "Method must return all correct abbreviations with the message in " +
                        "different cases(upper/lower) and make correct spaces between them."
        );
    }

    @Test
    public void testDublicates() {
        assertEquals(
                "As soon as possible as soon as possible im my humble opinion im my humble opinion",
                abbreviation.showAbbreviations("asapasap imhoimho"),
                "Method must return all correct abbreviations with the message in " +
                        "different cases(upper/lower) and make correct spaces between them."
        );
    }
}
