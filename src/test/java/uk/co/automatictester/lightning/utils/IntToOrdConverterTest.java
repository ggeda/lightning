package uk.co.automatictester.lightning.utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class IntToOrdConverterTest {

    @DataProvider(name = "testData")
    private String[][] testData() {
        return new String[][]{
                {"1", "1st"},
                {"2", "2nd"},
                {"3", "3rd"},
                {"4", "4th"},
                {"11", "11th"},
                {"12", "12th"},
                {"13", "13th"},
                {"14", "14th"},
                {"21", "21st"},
                {"22", "22nd"},
                {"23", "23rd"},
                {"24", "24th"}
        };
    }

    @Test(dataProvider = "testData")
    public void testConvert(String integer, String ordinal) {
        assertThat(new IntToOrdConverter().convert(Integer.parseInt(integer)), equalTo(ordinal));
    }
}