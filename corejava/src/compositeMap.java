
public class compositeMap {
	public static void main(String... args){
		DerivedMap DerivedMap=new DerivedMap();
		DerivedMap.map();
	}
	
	
        static abstract class Map{
                public abstract int map();
        }
       
        interface NewMap{
                int map();
        }
       
        static class DerivedMap extends Map{
                private int value=0;
                public DerivedMap(){
                        value=10;
                }
                public DerivedMap (int value){
                        this.value=value;
                }
                public int map(){
                        return 10;
                }
}
}