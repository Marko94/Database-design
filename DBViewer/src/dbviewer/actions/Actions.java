package dbviewer.actions;

public class Actions {

	private Append append;
	private Delete delete;
	private Edit edit;
	private Select select;
	
	public Actions(){
		append = new Append();
		delete = new Delete();
		edit = new Edit();
		select = new Select();
	}

	public Append getAppend() {
		return append;
	}

	public Delete getDelete() {
		return delete;
	}

	public Edit getEdit() {
		return edit;
	}

	public Select getSelect() {
		return select;
	}
	
	
}
