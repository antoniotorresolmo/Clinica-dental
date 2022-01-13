package init;

public class Init {

	public static void main(String[] args) {

		Init oInit = new Init();
		oInit.start();

	}
	
	private void start() {
		new views.FrmPrincipal();
	}

}
