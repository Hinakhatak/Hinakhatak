package labsessional2;

	public abstract class pictureviewerdecorator  implements pictureviewer {
		   protected pictureviewer decoratedpicture;

		   public pictureviewerdecorator( pictureviewer decoratedpicture){
		      this.decoratedpicture = decoratedpicture;
		   }

		   public void viewpic() {
			   decoratedpicture.viewpic();
		   }	
		}

