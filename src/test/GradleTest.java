
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class GradleTest {
    @Test
    public void gradle_test(){
        //given
        Dependency dependency = new Dependency();
        Gradle gradle=new Gradle(dependency);
        //when
        String actual=gradle.beenCalled();
        //then
        assertThat(actual, is("This is a Gradle Project."));
    }
    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);

    }

    }


