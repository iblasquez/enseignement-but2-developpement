package pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaTest {

	@Test
	void a_pizza_just_cooked_can_be_baked() {
		Pizza pizza = new Pizza();
		pizza.setState(Pizza.COOKED);
		
		boolean bakingDone = pizza.bake();
		assertTrue(bakingDone);
	}
	
	@Test
	void after_baking_it_the_pizza_is_baked() {
		Pizza pizza = new Pizza();
		pizza.setState(Pizza.COOKED);
		
		pizza.bake();
		assertEquals(Pizza.BAKED,pizza.getState());
	}
	
	@Test
	void a_pizza_just_baked_can_not_be_baked_again() {
		Pizza pizza = new Pizza();
		pizza.setState(Pizza.BAKED);
		
		boolean bakingDone = pizza.bake();
		assertFalse(bakingDone);
		}
	
	
	@Test
	void a_pizza_just_delivered_can_not_be_baked_again() {
		Pizza pizza = new Pizza();
		pizza.setState(Pizza.DELIVERED);
		
		boolean bakingDone = pizza.bake();
		assertFalse(bakingDone);
		}
	
	
	@Test
	void a_pizza_just_baked_can_be_delivered() {
		Pizza pizza = new Pizza();
		pizza.setState(Pizza.BAKED);
		
		boolean deliveringDone = pizza.deliver();
		assertTrue(deliveringDone);
	}
	
	@Test
	void after_delivering_it_the_pizza_is_delivered() {
		Pizza pizza = new Pizza();
		pizza.setState(Pizza.BAKED);
		
		pizza.deliver();
		assertEquals(Pizza.DELIVERED,pizza.getState());
	}
	
	
	@Test
	void a_pizza_just_delivered_can_not_be_delivered_again() {
		Pizza pizza = new Pizza();
		pizza.setState(Pizza.DELIVERED);
		
		boolean bakingDone = pizza.bake();
		assertFalse(bakingDone);
		}
	
	@Test
	void a_pizza_just_cooked_can_not_already_be_delivered() {
		Pizza pizza = new Pizza();
		pizza.setState(Pizza.COOKED);
		
		boolean bakingDone = pizza.deliver();
		assertFalse(bakingDone);
		}

		
}
