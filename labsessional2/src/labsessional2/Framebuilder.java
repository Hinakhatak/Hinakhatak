package labsessional2;

public class Framebuilder extends pictureviewerdecorator{
	public Framebuilder(pictureviewer decoratedpicture) {
	      super( decoratedpicture);		
	   }

	   @Override
	   public void viewpic() {
		   decoratedpicture.viewpic();
	   	       
	      setpicframe(decoratedpicture);
	   }

	   private void setpicframe(pictureviewer decoratedpicture){
	      System.out.println("Frame pic:top,bottom,left,right");
	   }
	   public Framebuilder addframe(){
		   topFrame top=new topFrame();
	        top.setpicframetop();   
	    
	    bottomFrame bottom=new bottomFrame();
	    bottom.setpicframebottom();
	    
	    leftFrame left=new leftFrame();
	    left.setpicframeleft();
	    
	    rightFrame right=new rightFrame();
	    right.setpicframeright();
	    return null;
		}
	}



