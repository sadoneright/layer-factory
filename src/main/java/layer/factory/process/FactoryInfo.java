package layer.factory.process;

public class FactoryInfo {
	public FactoryInfo(String name) {
		this.name = name;
	}

	public String name;

	public boolean isOpened;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOpened() {
		return isOpened;
	}

	public void setOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}

}
