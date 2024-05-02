package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class ShapeFactoryTest {
	
    private Circle circle;
    private Rectangle rectangle;
    
    @BeforeEach
    public void setUp() {
        circle = new Circle();
        rectangle = new Rectangle();
    }
    
    @Test
    @DisplayName("Test case for Circle instantiation")
    public void testCircleInstantiation() {
        assertEquals(Circle.class, circle.getClass(), "Circle object should be an instance of Circle class");
    }
    
    @Test
    @DisplayName("Test case for Rectangle instantiation")
    public void testRectangleInstantiation() {
        assertNotNull(rectangle, "Rectangle object should not be null");
    }
    
    @Test
    @DisplayName("Test case for drawing a Circle")
    public void testDrawCircle() {
        assertDoesNotThrow(() -> circle.draw(), "Drawing a circle should not throw an exception");
    }

    @Test
    @DisplayName("Test case for drawing a Rectangle")
    public void testDrawRectangle() {
        assertDoesNotThrow(() -> rectangle.draw(), "Drawing a rectangle should not throw an exception");
    }
	

	}

