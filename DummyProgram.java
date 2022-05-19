package library;

public class DummyProgram extends Title{

	private String editor;

	public DummyProgram(int id, String title, String editor) {
		super(id, title);
		this.editor = editor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public String toString() {
		return super.toString() + "Editor: " + editor;
	}
	
}