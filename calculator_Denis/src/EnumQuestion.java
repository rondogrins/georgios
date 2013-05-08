
public class EnumQuestion {

	public enum Color { RED, YELLOW, GREEN}
	enum Fruit{
		Banana(Color.RED), 
		Apple(Color.YELLOW), 
		Kiwi(Color.GREEN);
		
		private Color color;
		Fruit(Color color){
			this.color = color;
			
		}
	}
	class Test{
		public void method(){
			Color red = Color.values()[0];
			Fruit f = Fruit.Banana; switch (f){}
		} 
	}
}
