package abstractOverride;

public abstract class AbstractRecipe {
	public void execute() {
		prepareIngredients();
		cookRecipe();			
		cleanup();
	}

	abstract void prepareIngredients();
	abstract void cookRecipe();
	abstract void cleanup();
}
