package labsessional2;

public class demopic {
		   public static void main(String[] args) {
		   

			      pictureviewer view = new viewer();
			      pictureviewer viewframe = new Framebuilder(new viewer());
			      
			      System.out.println("PICTURE");
			      view.viewpic();

			      System.out.println("\nFraming Picture Choice");
			      viewframe.viewpic();
			      
			      
			      Framebuilder build=new Framebuilder(new viewer());
			      build.addframe();

			   }
}
